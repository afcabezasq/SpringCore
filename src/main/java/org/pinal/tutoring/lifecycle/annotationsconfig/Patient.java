package org.pinal.tutoring.lifecycle.annotationsconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PostConstruct
    public void myInit(){
        System.out.println("Inside myInit");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("Inside myDestroy");
    }




//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Inside detroy()");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//
//        System.out.println("Inside afterPropertiesSet()");
//
//    }
}
