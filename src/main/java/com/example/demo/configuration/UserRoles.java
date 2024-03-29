package com.example.demo.configuration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userroles")
public class UserRoles {

    @Id
    @Column(name = "userrole_id")
    private Integer id;

    @Column(name="user_role")
    private String userRole;

    @Column(name="user_name")
    private String name;

    @Column(name="user_password")
    private String password;

    public UserRoles() {
    }

    public UserRoles(Integer id, String userRole, String name, String password) {
        this.id = id;
        this.userRole = userRole;
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
