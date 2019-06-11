package com.example.demo.citizens.repository;

import com.example.demo.citizens.model.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CityRepository extends CrudRepository <City, Long> {

}
