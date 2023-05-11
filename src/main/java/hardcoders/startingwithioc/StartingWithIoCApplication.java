package hardcoders.startingwithioc;

import hardcoders.startingwithioc.Entity.Student;
import hardcoders.startingwithioc.Services.Students.IStudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StartingWithIoCApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartingWithIoCApplication.class, args);
    }

    // From the Spring Boot Framework
    // Executed after the Spring Beans have been loaded
    @Bean
    public CommandLineRunner commandLineRunner(IStudentService studentService) {
        return runner -> {
            createStudent(studentService);
        };
    }

    private void createStudent(IStudentService studentService)
    {
        // Create the student object
        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Paul", "Wall", "Paul@gmail.com");

        // save the Student object
        System.out.println("Saving the student...");
        studentService.save(tempStudent);

        // Display Id of the saved student
        System.out.printf("Saved student. Generated id: %d\n", tempStudent.getId());
    }

}
