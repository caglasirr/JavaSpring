package com.example.demo.Model;

import com.example.demo.Model.Enums.CustomerType;
import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String name;
    private int age;
    @Enumerated(EnumType.ORDINAL)
    private CustomerType customerType;

    public Customer(){};

    public Customer(String name, int age, CustomerType customerType) {
        super();
        this.name = name;
        this.age = age;
        this.customerType=customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
