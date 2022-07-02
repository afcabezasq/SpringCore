package org.pinal.tutoring.morespring.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInstructor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeannotationsconfig.xml");
        Instructor instructor = (Instructor) context.getBean("instructor");
        System.out.println(instructor);
    }

}
