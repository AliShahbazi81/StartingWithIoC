package hardcoders.startingwithioc.Services.Employees;

import hardcoders.startingwithioc.Entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee theEmployee);
    void deleteById(int id);
}
