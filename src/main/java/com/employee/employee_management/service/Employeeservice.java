package com.employee.employee_management.service;



import java.util.List;
import com.employee.employee_management.model.Employee;

public interface Employeeservice {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}
