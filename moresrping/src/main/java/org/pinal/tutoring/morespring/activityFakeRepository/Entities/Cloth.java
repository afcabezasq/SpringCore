package org.pinal.tutoring.morespring.activityFakeRepository.Entities;

public class Cloth {

    private String id;
    private String type;
    private String size;
    private String color;

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWas_bought(Boolean was_bought) {
        this.was_bought = was_bought;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Boolean getWas_bought() {
        return was_bought;
    }

    public Boolean was_bought;

    @Override
    public String toString() {
        return "Clothe{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", was_bought=" + was_bought +
                '}';
    }
}
