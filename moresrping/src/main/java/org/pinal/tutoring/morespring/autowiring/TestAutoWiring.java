package org.pinal.tutoring.morespring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringconfig.xml");
        Employee empl =(Employee)  context.getBean("employee");
        System.out.println(empl);
    }

}
