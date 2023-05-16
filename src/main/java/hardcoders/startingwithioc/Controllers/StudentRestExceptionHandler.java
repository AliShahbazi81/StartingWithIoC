package hardcoders.startingwithioc.Controllers;

import hardcoders.startingwithioc.Exceptions.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    // Add exception handling code here
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
