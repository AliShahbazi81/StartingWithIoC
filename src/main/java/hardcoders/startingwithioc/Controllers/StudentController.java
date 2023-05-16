package hardcoders.startingwithioc.Controllers;

import hardcoders.startingwithioc.Entity.Student;
import hardcoders.startingwithioc.Exceptions.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> allStudents;
    // Define endpoint for "/students" - return list of students


    // Post Construct methods will be executed after the constructor and after dependency injections
    //! Remember it will be executed only once
    @PostConstruct
    public void loadData()
    {
        allStudents = new ArrayList<>();

        allStudents.add(new Student("John", "Doe", "JohnDoe@gmail.com"));
        allStudents.add(new Student("Mary", "Public", "MaryPublic@gmail.com"));
        allStudents.add(new Student("Max", "Mustermann", "MaxMuster@gmail.com"));
    }

    @GetMapping("/GetAll")
    public List<Student> getStudents()
    {
        return allStudents;
    }

    @GetMapping("/GetById/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
        // Check the studentId again list size
        if((studentId >= allStudents.size() || (studentId < 0)))
            throw new StudentNotFoundException("Student id not found - " + studentId);

        return allStudents.get(studentId);
    }

    // Add an exception handler using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handlerException(StudentNotFoundException exc)
    {
        // Create a StudentErrorResponse
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(String.valueOf(System.currentTimeMillis()));

        //Return responseEntity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // The method down below will catch all the potential exceptions, since we are using Exception as a parameter
    // In that case, Not only the StudentNotFound, but all the other errors will be caught
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handlerException(Exception exc)
    {
        // Create a StudentErrorResponse

        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(String.valueOf(System.currentTimeMillis()));

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
