package org.pinal.tutoring.morespring.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImplementation2 implements OrderDAO {
    @Override
    public void createOrder() {
        System.out.println("Inside OrderDAOImplementation2 createOrder()");
    }
}
