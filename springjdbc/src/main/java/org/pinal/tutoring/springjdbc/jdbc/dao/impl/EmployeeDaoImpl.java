package org.pinal.tutoring.springjdbc.jdbc.dao.impl;

import org.pinal.tutoring.springjdbc.jdbc.dao.EmployeeDao;
import org.pinal.tutoring.springjdbc.jdbc.dao.rowmapper.EmployeeRowMapper;
import org.pinal.tutoring.springjdbc.jdbc.dto.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Override
    public int createEmployee(Employee employee) {
        String sql = "INSERT INTO employee VALUES(?,?,?)";
        int result = jdbcTemplate.update(sql,
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName());
        return result;
    }

    @Override
    public int updateEmployee(Employee employee) {
        String sql = "UPDATE employee SET firstname=?, lastname=? WHERE id=?";
        int result = jdbcTemplate.update(sql,
                employee.getFirstName(),
                employee.getLastName(),
                employee.getId());
        return result;
    }

    @Override
    public int deleteById(int id) {
        String sql = "DELETE FROM employee WHERE id=?";
        int result = jdbcTemplate.update(sql,id);
        return result;
    }

    @Override
    public Employee getEmployee(int id) {
        String sql = "SELECT * FROM employee WHERE id=?";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        Employee employee = jdbcTemplate.queryForObject(sql,rowMapper,id);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employee";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        List<Employee> employees = jdbcTemplate.query(sql,rowMapper);
        return employees;
    }
}
