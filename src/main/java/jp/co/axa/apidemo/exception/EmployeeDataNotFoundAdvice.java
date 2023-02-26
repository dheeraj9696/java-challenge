package jp.co.axa.apidemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author dheeraj9696
 */

@ControllerAdvice
public class EmployeeDataNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(EmployeeDataNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EmployeeDataNotFoundException ex) {
        return ex.getMessage();
    }
}
