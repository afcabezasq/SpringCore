package org.pinal.tutoring.listproperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hospitalconfig.xml");
        Hospital hospitalBean = (Hospital) context.getBean("hospital");

        System.out.println(hospitalBean.getDepartments().getClass());

    }
}
