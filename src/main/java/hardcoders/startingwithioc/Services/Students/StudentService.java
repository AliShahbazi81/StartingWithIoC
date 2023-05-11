package hardcoders.startingwithioc.Services.Students;

import hardcoders.startingwithioc.Entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void save(Student student) {
        _entityManager.persist(student);
    }
}
