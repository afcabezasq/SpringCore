package org.pinal.tutoring.morespring.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

    @Value("#{12+26}")
    private int id;

    @Value("Andres and Company Limited")
    private String company;

    @Value("Sprong with Andres")
    private String courseTitle;

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id + '\''+
                "company='" + company + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                '}';
    }
}
