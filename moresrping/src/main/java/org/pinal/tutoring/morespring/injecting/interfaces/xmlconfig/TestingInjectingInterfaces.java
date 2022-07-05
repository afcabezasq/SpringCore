package org.pinal.tutoring.morespring.injecting.interfaces.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingInjectingInterfaces {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injectinginterfacesconfig.xml");
        OrderBO order = (OrderBO) context.getBean("bo");
        order.placeOrder();
    }
}
