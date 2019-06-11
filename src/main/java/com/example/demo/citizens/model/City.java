package com.example.demo.citizens.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Float latitude;

    private Float longitude;

    @OneToMany(mappedBy = "city")
    private Set<Person> person;

    public Set<Person> getPerson() {
        return person;
    }

    public City(Set<Person> persons) {
        this.person = persons;
    }

    public void setPerson(Set<Person> person) {
        this.person = person;
    }

    public City() {
    }

    public City(int id, String name, Float latitude, Float longtitude) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longtitude;
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

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return name;
    }

}
