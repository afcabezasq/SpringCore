package org.pinal.tutoring.propertiesinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountriesAndLanguages {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesinjectionconfig.xml");
        CountriesAndLanguages instance = (CountriesAndLanguages) context.getBean("candlang");

        System.out.println(instance.toString());

    }
}
