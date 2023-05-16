package hardcoders.startingwithioc.DAO;

import hardcoders.startingwithioc.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    // Define filed for EntityManager
    private EntityManager _entityManager;

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        _entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        //Create a query
        TypedQuery<Employee> theQuery = _entityManager.createQuery("FROM Employee", Employee.class);

        // Execute query and get result list && return the results
        return theQuery.getResultList();
    }

    @Override
    public Employee findById(int id) {
        // Get employee
        // return employee
        return _entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee theEmployee) {
        // Save employee
        //! Warning: in the code down below, if id == 0 then the data will be inserted and saved, otherwise it will be updated
        Employee dbEmployee = _entityManager.merge(theEmployee);

        // return dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int id) {
        // find employee by id
        Employee theEmployee = _entityManager.find(Employee.class, id);

        // Remove Employee
        _entityManager.remove(theEmployee);

    }
}
