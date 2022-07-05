package org.pinal.tutoring.morespring.injecting.interfaces.xmlconfig;

public class OrderDAOImplementation2 implements OrderDAO{
    @Override
    public void createOrder() {
        System.out.println("Inside OrderDAOImplementation2 createOrder()");
    }
}
