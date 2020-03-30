package com.patterns.structural.facade;

import com.patterns.creational.singleton.DbSingletonLazy;

import java.util.Collections;
import java.util.List;
//helps to reduce a bunch of code on client side
public class JdbcFacade {

    private DbSingletonLazy dbSingletonLazy = null;

    public JdbcFacade() {
        this.dbSingletonLazy = DbSingletonLazy.getInstance();
    }

    public int createTable() {
        System.out.println("Table Address created");
        return 1;
    }

    public int insertIntoTable() {
        System.out.println("Inserting into Addresses");
        return 1;
    }

    public List<Address> getAddresses() {
        return Collections.singletonList(new Address("123", "street", "Warsaw"));
    }

}

class Address {
    private String id;
    private String streetName;
    private String city;

    public Address(String id, String streetName, String city) {
        this.id = id;
        this.streetName = streetName;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
