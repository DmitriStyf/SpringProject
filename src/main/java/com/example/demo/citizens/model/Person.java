package com.example.demo.citizens.model;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    private City city;

    public City getCity() {
        return city;
    }

    public Person(City somecity) {
        this.city = somecity;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Person() {
    }

    public Person(Integer id, String name, Integer city_id) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
