package hardcoders.startingwithioc.Services.Students;

import hardcoders.startingwithioc.Entity.Student;

import java.util.List;

public interface IStudentService {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void update(Student student);
    void deleteById(Integer id);
    int deleteAllStudents();
}
