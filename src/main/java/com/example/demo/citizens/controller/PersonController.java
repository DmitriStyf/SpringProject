package com.example.demo.citizens.controller;

import com.example.demo.citizens.model.Person;
import com.example.demo.citizens.repository.CityRepository;
import com.example.demo.citizens.service.PersonService;
import com.example.demo.citizens.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class PersonController {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

//    @GetMapping(path = "person/all")
//    public List<Person> getPersons() {
//        return personService.getPersons();
//    }

    @GetMapping(path = "person/frontend/all")
    public ModelAndView persons() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("persons");
        modelAndView.addObject("persons", personRepository.findAll());
        return modelAndView;
    }

    @GetMapping(path = "/person/frontend/add")
    public String get(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "addperson";
    }

    @PostMapping(path = "/person/frontend/add")
    public String addNewPerson(Model model, @ModelAttribute("person") Person person) {
        personRepository.save(person);
        return "addperson";
    }


}

