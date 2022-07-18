package org.pinal.tutoring.springjdbc.jdbc;

import org.pinal.tutoring.springjdbc.jdbc.dao.EmployeeDao;
import org.pinal.tutoring.springjdbc.jdbc.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestJdbc {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcconfig.xml");
        //JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
////    //String sql = "insert into employee values(?,?,?)";
////    //int result = jdbcTemplate.update(sql,new Integer(209),"Cassandra","Johnson");
////    //System.out.println(result);
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
        Employee employee = new Employee();
        List<Employee> allEmployees = employeeDao.getAllEmployees();

        for(Employee e:allEmployees){
            System.out.println(e);
        }
    }
}
