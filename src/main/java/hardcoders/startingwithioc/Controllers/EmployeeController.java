package hardcoders.startingwithioc.Controllers;


import hardcoders.startingwithioc.Entity.Employee;
import hardcoders.startingwithioc.Services.Employees.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private IEmployeeService _employeeService;

    @Autowired
    public EmployeeController(IEmployeeService employeeService) {
        _employeeService = employeeService;
    }

    @GetMapping("/Employees")
    public List<Employee> findAll()
    {
        return _employeeService.findAll();
    }

    @GetMapping("/Employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId)
    {
        Employee theEmployee = _employeeService.findById(employeeId);

        if (theEmployee == null)
            throw new RuntimeException("Employee with the id of " + employeeId + " has not found !");

        return theEmployee;
    }
}
