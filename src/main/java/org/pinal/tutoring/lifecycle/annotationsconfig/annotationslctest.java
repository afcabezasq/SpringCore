package org.pinal.tutoring.lifecycle.annotationsconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationslctest {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleannotationsconfig.xml");
        context.registerShutdownHook();
        Patient patient= (Patient) context.getBean("patient");
        System.out.println(patient.toString());
    }
}
