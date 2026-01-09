package com.employee.employee_management.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// “I used @Entity to map the class to a database table and @Table to define the table name. 
// The primary key is auto-generated using GenerationType.IDENTITY.
//  I followed Java naming conventions to ensure proper JSON serialization and database mapping.”

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;;
    private String name;
    private String department;
private double salary;
public long getId() {
    return id;
}
public void setId(long id) {
    id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
   name = name;
}
public String getDepartment() {
    return department;
}
public void setDepartment(String department) {
    this.department = department;
}
public double getSalary() {
    return salary;
}
public void setSalary(double salary) {
    this.salary = salary;
}
}
