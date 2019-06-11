package com.example.demo.students;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name="user")
public class Students {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="user_id")
    private Long id;

    @Column(name="first_name")
    private String firstN;

    @Column(name="last_name")
    private String lastN;

    @Column(name="age")
    private int age;

    @Column(name="active")
    private int active;

    @Column(name="gender")
    private String gender;

    @Column(name="bio")
    private String bio;

    @Column(name="started_on")
    private Date started;

    private Integer department;

    public Students(Integer department) {
        this.department = department;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Students(){

    }

    public Students(String firstN, String lastN, int age, int active, String gender, String bio, Date started) {
        this.id = id;
        this.firstN = firstN;
        this.lastN = lastN;
        this.age = age;
        this.active = active;
        this.gender = gender;
        this.bio = bio;
        this.started = started;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }
}
