package org.pinal.tutoring.morespring.autowiring.byConsturctor;

public class Employee {

    Employee(Address address){
        this.address = address;
    }

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
