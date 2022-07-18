package org.pinal.tutoring.springjdbc.jdbcwithannotations.dao;

import org.pinal.tutoring.springjdbc.jdbcwithannotations.dto.Employee;

import java.util.List;

public interface EmployeeDao {

    int createEmployee(Employee employee);
    int updateEmployee(Employee employee);
    int deleteById(int id);
    Employee getEmployee(int id);
    List<Employee> getAllEmployees();
}
