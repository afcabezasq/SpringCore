package org.pinal.tutoring.setconfig;

import java.util.Set;

public class CarDealer {

    private String name;
    private Set<String> brands;

    public void setName(String name) {
        this.name = name;
    }

    public void setBrands(Set<String> brands) {
        this.brands = brands;
    }

    public String getName() {
        return name;
    }

    public Set<String> getBrands() {
        return brands;
    }

    @Override
    public String toString() {
        return "CarDealer{" +
                "name='" + name + '\'' +
                ", brands=" + brands +
                '}';
    }
}
