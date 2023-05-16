package hardcoders.startingwithioc;

import hardcoders.startingwithioc.Entity.Student;
import hardcoders.startingwithioc.Services.Students.IStudentService;
import org.hibernate.id.factory.internal.StandardIdentifierGeneratorFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StartingWithIoCApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartingWithIoCApplication.class, args);
    }

    // From the Spring Boot Framework
    // Executed after the Spring Beans have been loaded
//    @Bean
//    public CommandLineRunner commandLineRunner(IStudentService studentService) {
//        return runner -> {
//            createStudent(studentService);
////            readStudent(studentService);
////            queryForStudents(studentService);
////            queryForStudentsByLastName(studentService);
////            updateStudent(studentService);
////            deleteStudent(studentService);
////            deleteAllStudents(studentService);
//
//        };
//    }

//    private void deleteAllStudents(IStudentService studentService)
//    {
//        System.out.println("Deleting all students...");
//        int numberOfDeletedRows = studentService.deleteAllStudents();
//        System.out.printf("Deleted %d rows\n", numberOfDeletedRows);
//    }
//
//    private void deleteStudent(IStudentService studentService)
//    {
//        // Delete student with id: 1
//        int studentId = 1;
//        System.out.println("Deleting student with id: " + studentId);
//        studentService.deleteById(studentId);
//    }
//
//    private void updateStudent(IStudentService studentService)
//    {
//
//        // Retrieve student based on the id: Primary key
//        int studentId = 1;
//        System.out.println("Getting student with id: " + studentId);
//        Student myStudent = studentService.findById(studentId);
//
//        // Change first name to "Scooby"
//        System.out.println("Updating student...");
//        myStudent.setFirstName("Scooby");
//
//        // Update the student
//        studentService.update(myStudent);
//
//        // Display the updated student
//        System.out.println("Updated student: " + myStudent);
//    }
//
//    private void queryForStudentsByLastName(IStudentService studentService) {
//
//        // Get a list of students
//        List<Student> theStudents = studentService.findByLastName("Duck");
//
//        // Display list of students
//        for (Student student : theStudents) {
//            System.out.println(student);
//        }
//    }
//
//    private void queryForStudents(IStudentService studentService) {
//
//            // Display all students
//            System.out.println("Display all students...");
//            for (Student student : studentService.findAll()) {
//                System.out.println(student);
//            }
//
//            // Display students with last name "Duck"
//            System.out.println("Display students with last name Duck...");
//            for (Student student : studentService.findAll()) {
//                if (student.getLastName().equals("Duck")) {
//                    System.out.println(student);
//                }
//            }
//    }
//
//    private void readStudent(IStudentService studentService) {
//
//        // Create a student object
//        System.out.println("Create a new student...");
//        Student tempStudent = new Student("Daffy", "Duck", "daffy@gmail.com");
//
//        // save the Student
//        System.out.println("Saving the student...");
//        studentService.save(tempStudent);
//
//        // Display id of the saved student
//
//        int studentId = tempStudent.getId();
//        System.out.println("The id of the created student is: " + studentId);
//
//        // Retrieve student based on the id: Primary key
//        System.out.println("Retrieving student with id: " + studentId);
//        Student myStudent = studentService.findById(studentId);
//
//        // Display student
//
//        System.out.println("Found the student: " + myStudent);
//    }
//
//    private void createStudent(IStudentService studentService)
//    {
//        // Create the student object
//        System.out.println("Creating new student object...");
//        // Creating a temp student in order to save it in the database
//        Student tempStudent = new Student("Paul", "Wall", "Paul@gmail.com");
//
//        // save the Student object
//        System.out.println("Saving the student...");
//        // For saving the student in the database
//        studentService.save(tempStudent);
//
//        // Display Id of the saved student
//        System.out.printf("Saved student. Generated id: %d\n", tempStudent.getId());
//    }

}
