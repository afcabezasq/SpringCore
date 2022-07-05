package org.pinal.tutoring.morespring.injecting.interfaces.xmlconfig;

public class OrderDAOImplementation implements OrderDAO{
    @Override
    public void createOrder() {
        System.out.println("Inside OrderDaoImplementation createOrder()");
    }
}
