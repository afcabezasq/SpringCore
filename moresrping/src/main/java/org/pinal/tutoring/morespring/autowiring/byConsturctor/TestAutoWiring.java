package org.pinal.tutoring.morespring.autowiring.byConsturctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringbyconstructorconfig.xml");
        Employee empl =(Employee)  context.getBean("employee");
        System.out.println(empl);
    }

}
