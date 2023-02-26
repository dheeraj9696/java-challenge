package jp.co.axa.apidemo.services;

import jp.co.axa.apidemo.entities.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;

/**
 * Interface to handle all CRUD operations of employee
 * @author dheeraj9696
 */

public interface EmployeeService {

    /**
     * Get employeeList
     * @return List of all employees
     */
    public List<Employee> retrieveEmployees();

    /**
     * Method to get all details of particular employee
     *
     * @param employeeId
     * @return (id, name, salary, department) of the employee
     */
    @Cacheable("employees")
    public Optional<Employee> getEmployee(Long employeeId);

    /**
     * Save employee detail
     * @param employee
     */
    public Employee saveEmployee(Employee employee);

    /**
     * Delete employee detail from employeeId.
     * @param employeeId
     */
    public void deleteEmployee(Long employeeId);

    /**
     * Update employee information
     * @param employee
     */
    public Employee updateEmployee(Employee employee);
}