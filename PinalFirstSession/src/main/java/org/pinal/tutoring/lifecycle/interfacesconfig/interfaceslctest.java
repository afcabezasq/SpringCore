package org.pinal.tutoring.lifecycle.interfacesconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class interfaceslctest {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleinterfacesconfig.xml");
        context.registerShutdownHook();
        Patient patient= (Patient) context.getBean("patient");
        System.out.println(patient.toString());
    }
}
