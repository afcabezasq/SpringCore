package org.pinal.tutoring.springjdbc.jdbc.dao.rowmapper;

import org.pinal.tutoring.springjdbc.jdbc.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt(1));
        employee.setFirstName(resultSet.getString(2));
        employee.setLastName(resultSet.getString(3));
        return employee;
    }
}
