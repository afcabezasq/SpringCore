package org.pinal.tutoring.springjdbc.petstore.dao.impl;

import org.pinal.tutoring.springjdbc.petstore.dao.AnimalsDao;
import org.pinal.tutoring.springjdbc.petstore.dto.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("animalsDao")
public class AnimalImpl implements AnimalsDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int registerAnimal(Animal animal) {
        String sql = "INSERT INTO animals VALUES(?,?,?,?)";
        int  result = jdbcTemplate.update(sql);

        return result;
    }

    @Override
    public int updateAnimal(Animal animal) {
        return 0;
    }

    @Override
    public int deleteAnimalById(String id) {
        return 0;
    }

    @Override
    public Animal getAnimalById(String id) {
        return null;
    }

    @Override
    public List<Animal> getAllAnimals() {
        return null;
    }
}
