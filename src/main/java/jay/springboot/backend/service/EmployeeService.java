package jay.springboot.backend.service;

import jay.springboot.backend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
