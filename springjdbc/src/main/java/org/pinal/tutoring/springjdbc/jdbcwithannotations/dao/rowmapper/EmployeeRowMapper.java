package org.pinal.tutoring.springjdbc.jdbcwithannotations.dao.rowmapper;

import org.pinal.tutoring.springjdbc.jdbcwithannotations.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt(1));
        employee.setFirstName(resultSet.getString(2));
        employee.setLastName(resultSet.getString(3));

        return employee;
    }
}
