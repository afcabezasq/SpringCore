package org.pinal.tutoring.morespring.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Instructor {

    //@Value("#{-52}")
    //@Value("#{T(java.lang.Integer).MIN_VALUE}")
    //@Value("#{T(java.lang.Math).abs(-65)}")
    @Value("#{new Integer(23)}")
    private int id = 10;

    //@Value("Andres Cabezas")
    //@Value("#{'Andres'.toUpperCase()}")
    private String name = "Robert";

    //@Value("#{4<9}")
    @Value("#{3<1?false:true}")
    private boolean isTeaching;

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
                ", isTeaching=" + isTeaching +
                '}';
    }
}
