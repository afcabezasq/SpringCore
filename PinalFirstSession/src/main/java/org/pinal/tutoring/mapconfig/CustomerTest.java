package org.pinal.tutoring.mapconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("customerconfig.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.toString());

        System.out.println(customer.getProducts().get(600));
        System.out.println(customer.getProducts().getClass());


    }
}
