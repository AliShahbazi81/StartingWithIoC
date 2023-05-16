package hardcoders.startingwithioc.DAO;

import hardcoders.startingwithioc.Entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee theEmployee);
    void deleteById(int id);
}
