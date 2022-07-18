package org.pinal.tutoring.springjdbc.jdbcwithannotations;


import org.pinal.tutoring.springjdbc.jdbcwithannotations.dao.EmployeeDao;
import org.pinal.tutoring.springjdbc.jdbcwithannotations.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestEmployeeJdbc {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcwithannotationsconfig.xml");
        //JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        //String sql = "insert into employee values(?,?,?)";
        //int result = jdbcTemplate.update(sql,new Integer(209),"Cassandra","Johnson");
        //System.out.println(result);
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");

        Employee employee = new Employee();

        employee.setId(210);
        employee.setFirstName("Hermes");
        employee.setLastName("Smith");

        //int result = employeeDao.createEmployee(employee);
        //int result = employeeDao.updateEmployee(employee);
        //int result = employeeDao.deleteById(210);
        //Employee e = employeeDao.getEmployee(210);
        //System.out.println("Number of affected queries: "+ result);
        //System.out.println(e);

        List<Employee> allEmployees = employeeDao.getAllEmployees();

        for( Employee e:allEmployees){
            System.out.println(e);
        }


    }
}
