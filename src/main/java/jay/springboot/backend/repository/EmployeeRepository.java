package jay.springboot.backend.repository;

import jay.springboot.backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
