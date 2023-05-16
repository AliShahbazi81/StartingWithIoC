package hardcoders.startingwithioc.Services.Employees;

import hardcoders.startingwithioc.DAO.EmployeeDao;
import hardcoders.startingwithioc.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    private EmployeeDao _employee;

    @Autowired
    public EmployeeService(EmployeeDao employee) {
        _employee = employee;
    }

    @Override
    public List<Employee> findAll() {
        return _employee.findAll();
    }

    @Override
    public Employee findById(int id) {
        return _employee.findById(id);
    }

    // Since we are saving, we need transactional
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return _employee.save(theEmployee);
    }

    // Since we are deleting, we need transactional
    @Transactional
    @Override
    public void deleteById(int id) {
        _employee.deleteById(id);
    }
}
