package org.pinal.tutoring.injectingreferences;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("studentconfig.xml");
        Student s = (Student) context.getBean("student");
        System.out.println(s.toString());

    }
}
