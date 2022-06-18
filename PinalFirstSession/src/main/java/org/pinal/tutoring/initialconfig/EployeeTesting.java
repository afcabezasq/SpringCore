package org.pinal.tutoring.initialconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EployeeTesting {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("initialconfig.xml");
        Employee emp = (Employee) ctx.getBean("employee");
        System.out.println(emp.toString());
    }
}
