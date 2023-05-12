package hardcoders.startingwithioc.Services.Students;

import hardcoders.startingwithioc.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentService implements IStudentService{

    // Define field for entity manager
    private EntityManager _entityManager;

    // Inject entity manager using constructor injection
    @Autowired
    public StudentService(EntityManager entityManager) {
        _entityManager = entityManager;
    }

    // Implement Save method
    @Override
    // @Transactional means that this method will be executed in a transaction
    //! Remember, Transactional will be used only if we want to either save or update
    @Transactional
    public void save(Student student) {
        _entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return _entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

        // Create query
        TypedQuery<Student> theQuery = _entityManager.createQuery("FROM Student order by lastName", Student.class);
        // Return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        // Create query
        TypedQuery<Student> theQuery = _entityManager.createQuery("FROM Student where lastName = :lastName", Student.class);

        // Set query parameters
        theQuery.setParameter("lastName", lastName);

        // Return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        _entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        // Create query
        Student myStudent = _entityManager.find(Student.class, id);
        _entityManager.remove(myStudent);
    }

    @Override
    @Transactional
    public int deleteAllStudents() {
        int numberOfDeletedRows = _entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numberOfDeletedRows;
    }
}
