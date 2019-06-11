package com.example.demo.citizens.repository;

import com.example.demo.citizens.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository <Person, Long> {

    List<Person> findAll ();
}
