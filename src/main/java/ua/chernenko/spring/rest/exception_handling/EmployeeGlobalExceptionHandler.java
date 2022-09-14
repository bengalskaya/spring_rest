package ua.chernenko.spring.rest.exception_handling;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(NoSuchEmployeeException exception) {
        
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());
        
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(Exception exception) {
        
        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());
        
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

}
