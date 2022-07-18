package org.pinal.tutoring.springjdbc.petstore.dao;

import org.pinal.tutoring.springjdbc.petstore.dto.Animal;

import java.util.List;

public interface AnimalsDao {

    int registerAnimal(Animal animal);
    int updateAnimal(Animal animal);
    int deleteAnimalById(String id);
    Animal getAnimalById(String id);
    List<Animal> getAllAnimals();

}
