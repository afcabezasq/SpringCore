package org.pinal.tutoring.springjdbc.jdbcwithannotations.dao.impl;

import org.pinal.tutoring.springjdbc.jdbcwithannotations.dao.EmployeeDao;
import org.pinal.tutoring.springjdbc.jdbcwithannotations.dao.rowmapper.EmployeeRowMapper;
import org.pinal.tutoring.springjdbc.jdbcwithannotations.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int createEmployee(Employee employee) {
        String sql = "INSERT INTO employee VALUES(?,?,?)";
        int result = jdbcTemplate.update(sql,
                employee.getId(), employee.getFirstName(), employee.getLastName());
        return result;
    }

    @Override
    public int updateEmployee(Employee employee) {
        String sql = "UPDATE employee SET firstname=?, lastname=? where id=?";
        int result = jdbcTemplate.update(sql,
                employee.getFirstName(), employee.getLastName(), employee.getId());
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
