package org.pinal.tutoring.setconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDealerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("cardealerconfig.xml");

        CarDealer myCarDealer = (CarDealer) ctx.getBean("cardealer");

        System.out.println(myCarDealer.toString());

        System.out.println(myCarDealer.getBrands().getClass());
    }
}
