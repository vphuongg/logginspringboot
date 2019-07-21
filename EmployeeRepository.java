package Main.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import Main.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	Iterable<Employee> findAll();
	
//	@Query("select e., s.name from Employee e")
//	List<Object> getSchoolIdAndName();
	List<Employee> findByEmpNo(String empNo);
	List<Employee> findByFullName(String fullName);
	
	
    @Query("SELECT e.id FROM Employee e")
    List<Employee> getID();

}
