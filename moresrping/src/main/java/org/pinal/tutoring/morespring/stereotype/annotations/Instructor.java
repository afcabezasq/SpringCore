package org.pinal.tutoring.morespring.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Instructor {

    @Value("103")
    private int id = 10;

    @Value("Andres Cabezas")
    private String name = "Robert";

    @Value("#{topics}")
    private List<String> topics;

    @Autowired
    private Profile profile;

//    public Instructor(int id, String name, List<String> topics) {
//        this.id = id;
//        this.name = name;
//        this.topics = topics;
//    }


    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topics=" + topics +
                ", profile=" + profile +
                '}';
    }
}
