package org.pinal.tutoring.springjdbc.jdbc.dao;

import org.pinal.tutoring.springjdbc.jdbc.dto.Employee;

import java.util.List;

public interface EmployeeDao {

    int createEmployee(Employee employee);
    int updateEmployee(Employee employee);
    int deleteById(int id);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
}