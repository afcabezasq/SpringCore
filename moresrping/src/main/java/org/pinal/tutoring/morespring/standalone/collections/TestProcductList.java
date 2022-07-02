package org.pinal.tutoring.morespring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProcductList {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollectionsconfig.xml");
        ProductList pl = (ProductList) context.getBean("productList");
        System.out.println(pl);
    }
}
