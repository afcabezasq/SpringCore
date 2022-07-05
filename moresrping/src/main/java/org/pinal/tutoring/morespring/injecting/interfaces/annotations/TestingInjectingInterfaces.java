package org.pinal.tutoring.morespring.injecting.interfaces.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingInjectingInterfaces {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injectinginterfacesannotationsconfig.xml");
        //OrderBO order = (OrderBO) context.getBean("orderBOImplementation");
        OrderBO order = (OrderBO) context.getBean("bo");
        order.placeOrder();
    }
}
