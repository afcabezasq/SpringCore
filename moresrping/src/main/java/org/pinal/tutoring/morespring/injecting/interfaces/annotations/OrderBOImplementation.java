package org.pinal.tutoring.morespring.injecting.interfaces.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImplementation implements OrderBO {

    @Autowired
    @Qualifier("dao2")
    private OrderDAO dao;

    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }

    public OrderDAO getDao() {
        return dao;
    }

    @Override
    public void placeOrder() {
        System.out.println("Inside OrderBOImplementation");
        dao.createOrder();
    }
}
