package com.example.demo.controllers;

import com.example.demo.configuration.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @Autowired
    UserRoleRepository userRoleRepository;

    @GetMapping(path="user")
    public String get(){
        return "user";
    }

    @GetMapping(path = "/loggedinuser")
    public String getCurrentLoggedInUser(Principal principal){
        String name = principal.getName();
        return name;
    }
}

