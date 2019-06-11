package com.example.demo.citizens.service;

import com.example.demo.citizens.model.Person;
import com.example.demo.citizens.repository.CityRepository;
import com.example.demo.citizens.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

    @Autowired
    CityRepository cityRepository;


    public List<Person> getPersons() {
        return personRepository.findAll();
    }

}



/*

@Service
public class AuthorService {
    @Autowired
    AuthorDao authorDao;

    public List<Author> getAuthors() {
        return authorDao.findAll();
    }*/
