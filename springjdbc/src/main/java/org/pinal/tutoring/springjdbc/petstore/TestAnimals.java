package org.pinal.tutoring.springjdbc.petstore;

import org.pinal.tutoring.springjdbc.petstore.dao.AnimalsDao;
import org.pinal.tutoring.springjdbc.petstore.dto.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class TestAnimals {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("petstoreconfig.xml");

        AnimalsDao dao = (AnimalsDao) context.getBean("animalsDao");

        Animal animal = new Animal();

    }




}
