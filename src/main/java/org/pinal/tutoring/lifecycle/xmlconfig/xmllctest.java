package org.pinal.tutoring.lifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmllctest {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclecmlconfig.xml");
        //context.registerShutdownHook();

        Patient patient= (Patient) context.getBean("patient");
        System.out.println(patient.toString());
    }
}
