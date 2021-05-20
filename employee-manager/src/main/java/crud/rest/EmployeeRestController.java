package crud.rest;

import crud.repo.Employee;
import crud.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    EmployeeRepository repository;

    @Autowired
    public EmployeeRestController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable long employeeId) {
        return repository.findById(employeeId);
    }

    @PostMapping("/employees")
    public Optional<Employee> addEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return Optional.of(employee);
    }

    @PutMapping("/employees")
    public Optional<Employee> updateEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return Optional.of(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable long employeeId) {
        Optional<Employee> tempEmployee = repository.findById(employeeId);
        if (!tempEmployee.isPresent()) {
            throw new RuntimeException("Employee id not found: " + employeeId);
        }
        Employee employee = tempEmployee.get();
        repository.delete(employee);
        return "Deleted employee with id: " + employeeId;
    }
}
