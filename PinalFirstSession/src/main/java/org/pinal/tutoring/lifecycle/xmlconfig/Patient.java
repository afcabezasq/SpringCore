package org.pinal.tutoring.lifecycle.xmlconfig;

public class Patient {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }

    public void myInit(){
        System.out.println("Inside myInit");
    }

    public void myDestroy(){
        System.out.println("Inside myDestroy");
    }
}
