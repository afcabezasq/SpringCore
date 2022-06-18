package org.pinal.tutoring.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class DependencyCheckTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependencycheckconfig.xml");
        Prescription p = (Prescription) context.getBean("prescription");
        System.out.println(p.toString());
    }
}
