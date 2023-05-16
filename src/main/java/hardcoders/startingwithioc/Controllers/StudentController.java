package hardcoders.startingwithioc.Controllers;

import hardcoders.startingwithioc.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    // Define endpoint for "/students" - return list of students

    @GetMapping("/GetAll")
    public List<Student> getStudents()
    {
        List<Student> allStudents = new ArrayList<>();

        allStudents.add(new Student("John", "Doe", "JohnDoe@gmail.com"));
        allStudents.add(new Student("Mary", "Public", "MaryPublic@gmail.com"));
        allStudents.add(new Student("Max", "Mustermann", "MaxMuster@gmail.com"));

        return allStudents;
    }

    @GetMapping("/GetById/{studentId}")
    public Student getStudent(@PathVariable Integer studentId)
    {
        List<Student> allStudents = new ArrayList<>();

        allStudents.add(new Student("John", "Doe", "JohnDoe@gmail.com"));
        allStudents.add(new Student("Mary", "Public", "MaryPublic@gmail.com"));
        allStudents.add(new Student("Max", "Mustermann", "MaxMuster@gmail.com"));

        return allStudents.get(studentId);
    }
}
