package org.pinal.tutoring.morespring.autowiring.byAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {


    @Autowired
    @Qualifier("address2")
    private Address address;


//    public Employee(Address address) {
//        this.address = address;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
