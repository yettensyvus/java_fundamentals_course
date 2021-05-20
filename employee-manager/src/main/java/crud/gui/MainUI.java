package crud.gui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.data.sort.SortDirection;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;
import crud.repo.Employee;
import crud.repo.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.vaadin.spring.events.EventBus;
import org.vaadin.spring.events.EventScope;
import org.vaadin.spring.events.annotation.EventBusListenerMethod;
import org.vaadin.viritin.button.ConfirmButton;
import org.vaadin.viritin.button.MButton;
import org.vaadin.viritin.components.DisclosurePanel;
import org.vaadin.viritin.fields.MTextField;
import org.vaadin.viritin.grid.MGrid;
import org.vaadin.viritin.label.RichText;
import org.vaadin.viritin.layouts.MHorizontalLayout;
import org.vaadin.viritin.layouts.MVerticalLayout;

@Title("Employee CRUD")
@Theme("valo")
@SpringUI
public class MainUI extends UI {

    private static final long serialVersionUID = 1L;

    EmployeeRepository repo;
    EmployeeForm employeeForm;
    EventBus.UIEventBus eventBus;

    private MGrid<Employee> list = new MGrid<>(Employee.class)
            .withProperties("id", "name", "jobTitle", "email", "phoneNumber")
            .withColumnHeaders("id", "Nume", "Profesia", "Email", "Phone")
            .withFullWidth();

    private MTextField filterByName = new MTextField()
            .withPlaceholder("Filtrează după nume");
    private Button addNew = new MButton(VaadinIcons.FILE_ADD, this::add);
    private Button edit = new MButton(VaadinIcons.EDIT, this::edit);
    private Button delete = new ConfirmButton(VaadinIcons.FILE_REMOVE,
            "Sigur doriți să ștergeți angajatul?", this::remove);

    public MainUI(EmployeeRepository repo, EmployeeForm employeeForm, EventBus.UIEventBus uiEventBus) {
        this.repo = repo;
        this.employeeForm = employeeForm;
        this.eventBus = uiEventBus;
    }

    @Override
    protected void init(VaadinRequest request) {
        setContent(
                new MVerticalLayout(
                        new MHorizontalLayout(filterByName),
                        new MHorizontalLayout(addNew, edit, delete),
                        list
                ).expand(list)
        );
        listEntities();

        list.asSingleSelect().addValueChangeListener(e -> adjustActionButtonState());
        filterByName.addValueChangeListener(e -> {
            listEntities(e.getValue());
        });

    }

    protected void adjustActionButtonState() {
        boolean hasSelection = !list.getSelectedItems().isEmpty();
        edit.setEnabled(hasSelection);
        delete.setEnabled(hasSelection);
    }

    private void listEntities() {
        listEntities(filterByName.getValue());
    }

    final int PAGESIZE = 35;

    private void listEntities(String nameFilter) {
        String likeFilter = "%" + nameFilter + "%";
        list.setDataProvider(
                (sortOrder, offset, limit) -> {
                    final int pageSize = limit;
                    final int startPage = (int) Math.floor((double) offset / pageSize);
                    final int endPage = (int) Math.floor((double) (offset + pageSize - 1) / pageSize);
                    final Sort.Direction sortDirection = sortOrder.isEmpty() || sortOrder.get(0).getDirection() == SortDirection.ASCENDING ? Sort.Direction.ASC : Sort.Direction.DESC;
                    final String sortProperty = sortOrder.isEmpty() ? "id" : sortOrder.get(0).getSorted();
                    if (startPage != endPage) {
                        List<Employee> page0 = repo.findByNameLikeIgnoreCase(likeFilter, PageRequest.of(startPage, pageSize, sortDirection, sortProperty));
                        page0 = page0.subList(offset % pageSize, page0.size());
                        List<Employee> page1 = repo.findByNameLikeIgnoreCase(likeFilter, PageRequest.of(endPage, pageSize, sortDirection, sortProperty));
                        page1 = page1.subList(0, limit - page0.size());
                        List<Employee> result = new ArrayList<>(page0);
                        result.addAll(page1);
                        return result.stream();
                    } else {
                        return repo.findByNameLikeIgnoreCase(likeFilter, PageRequest.of(startPage, pageSize, sortDirection, sortProperty)).stream();
                    }
                },
                () -> (int) repo.countByNameLikeIgnoreCase(likeFilter)
        );
        adjustActionButtonState();
    }

    public void add(ClickEvent clickEvent) {
        edit(new Employee());
    }

    public void edit(ClickEvent e) {
        edit(list.asSingleSelect().getValue());
    }

    public void remove() {
        repo.delete(list.asSingleSelect().getValue());
        list.deselectAll();
        listEntities();
    }

    protected void edit(final Employee employee) {
        employeeForm.setEntity(employee);
        employeeForm.openInModalPopup();
    }

    @EventBusListenerMethod(scope = EventScope.UI)
    public void onEmployeeModified(EmployeeModifiedEvent event) {
        listEntities();
        employeeForm.closePopup();
    }

}
