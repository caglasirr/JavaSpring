package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "address")

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "address_id", unique = true, nullable = false)
    private int id;
    @Column(name = "country", nullable = true)


    private String country;
    @Column(name = "province", nullable = true)
    private String province;
//    @Column(name = "address", nullable = true)
//    private String address;

    public Address(String country, String province) {
        super();
        this.country = country;
        this.province = province;
    }

    public Address() {}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
}
