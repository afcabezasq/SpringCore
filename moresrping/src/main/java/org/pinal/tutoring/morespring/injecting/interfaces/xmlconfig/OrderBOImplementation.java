package org.pinal.tutoring.morespring.injecting.interfaces.xmlconfig;

public class OrderBOImplementation implements OrderBO {

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
