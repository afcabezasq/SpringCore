package org.pinal.tutoring.morespring.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

    @Value("Andres and Company Limited")
    private String company;

    @Value("Sprong with Andres")
    private String courseTitle;

    @Override
    public String toString() {
        return "Profile{" +
                "company='" + company + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                '}';
    }
}
