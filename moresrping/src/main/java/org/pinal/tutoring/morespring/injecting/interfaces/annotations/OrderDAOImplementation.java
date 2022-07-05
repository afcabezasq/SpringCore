package org.pinal.tutoring.morespring.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDAOImplementation implements OrderDAO {
    @Override
    public void createOrder() {
        System.out.println("Inside OrderDaoImplementation createOrder()");
    }
}
