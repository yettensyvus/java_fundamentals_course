package crud.gui;

import crud.repo.Employee;

import java.io.Serializable;

public class EmployeeModifiedEvent implements Serializable {

    private final Employee employee;

    public EmployeeModifiedEvent(Employee p) {
        this.employee = p;
    }

    public Employee getEmployee() {
        return employee;
    }




}
