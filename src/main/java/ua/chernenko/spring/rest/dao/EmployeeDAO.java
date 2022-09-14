package ua.chernenko.spring.rest.dao;

import java.util.List;

import ua.chernenko.spring.rest.entity.Employee;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
    
    public Employee getEmployee(int id);
    
    public void deleteEmployee(int id);
}
