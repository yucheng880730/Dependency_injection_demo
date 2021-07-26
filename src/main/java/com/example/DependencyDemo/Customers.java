package com.example.DependencyDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// the compiler check whether there is a customer bean available in the container or not
// if the bean is available, then the spring framework is basically injecting the customer
// object in your application
@Component
public class Customers {
    private int custid;
    private String custname;
    private String coursename;

    // is used to enable a class to recognize the other class
    // and make sure dependencies are satisfied
    @Autowired
    private Technologies techdetail;

    public Technologies getTechdetail() {
        return techdetail;
    }

    public void setTechdetail(Technologies techdetail) {
        this.techdetail = techdetail;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void display(){
        System.out.println("Customers Object Returned Successfully");
        techdetail.tech();
    }
}
