package crud.gui;

import com.vaadin.data.converter.LocalDateToDateConverter;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Component;
import com.vaadin.ui.DateField;
import com.vaadin.ui.TextField;
import crud.repo.Employee;
import crud.repo.EmployeeRepository;
import org.vaadin.spring.events.EventBus;
import org.vaadin.viritin.fields.MTextField;
import org.vaadin.viritin.form.AbstractForm;
import org.vaadin.viritin.layouts.MFormLayout;
import org.vaadin.viritin.layouts.MVerticalLayout;

@UIScope
@SpringComponent
public class EmployeeForm extends AbstractForm<Employee> {

    private static final long serialVersionUID = 1L;

    EventBus.UIEventBus eventBus;
    EmployeeRepository repo;

    TextField name = new MTextField("Nume");
    TextField jobTitle = new MTextField("Profesia");
    DateField birthDay = new DateField("Data Nasterii");
    TextField email = new MTextField("Email");
    TextField phoneNumber = new MTextField("Phone");

    EmployeeForm(EmployeeRepository r, EventBus.UIEventBus b) {
        super(Employee.class);
        this.repo = r;
        this.eventBus = b;

        setSavedHandler(employee -> {

            repo.save(employee);

            eventBus.publish(this, new EmployeeModifiedEvent(employee));
        });
        setResetHandler(p -> eventBus.publish(this, new EmployeeModifiedEvent(p)));

        setSizeUndefined();
    }

    @Override
    protected void bind() {
        getBinder()
                .forMemberField(birthDay)
                .withConverter(new LocalDateToDateConverter());
        super.bind();
    }

    @Override
    protected Component createContent() {
        return new MVerticalLayout(
                new MFormLayout(
                        name,
                        jobTitle,
                        birthDay,
                        email,
                        phoneNumber
                ).withWidth(""),
                getToolbar()
        ).withWidth("");
    }

}
