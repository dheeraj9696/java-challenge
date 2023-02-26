package jp.co.axa.apidemo.exception;

/**
 * @author dheeraj9696
 */

public class EmployeeDataNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public EmployeeDataNotFoundException(Long id) {
        super("Could not find targeted employee. Employee Id :" + id);
    }
}
