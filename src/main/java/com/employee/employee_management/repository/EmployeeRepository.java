package com.employee.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.employee_management.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

// : Why Repository layer?

// Separates database logic from business logic and improves maintainability.

// Q: Why interface instead of class?

// Spring generates implementation automatically at runtime.