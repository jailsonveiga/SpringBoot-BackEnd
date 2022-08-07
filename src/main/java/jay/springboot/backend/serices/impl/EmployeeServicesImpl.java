package jay.springboot.backend.serices.impl;

import jay.springboot.backend.exception.ResourceNotFoundException;
import jay.springboot.backend.model.Employee;
import jay.springboot.backend.repository.EmployeeRepository;
import jay.springboot.backend.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServicesImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServicesImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        if(employee.isPresent()) {
            return employee.get();
        }else {
            throw new ResourceNotFoundException("Employee", "Id", id);
        }
    }
}
