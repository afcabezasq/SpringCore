package org.pinal.tutoring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBeans {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("innerbeansconfig.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.toString());

        Employee employee1 = (Employee) context.getBean("employee");


        System.out.println(employee.hashCode());
        System.out.println(employee1.hashCode());



    }
}
