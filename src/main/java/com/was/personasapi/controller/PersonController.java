package com.was.personasapi.controller;

import com.was.personasapi.dto.response.MessageResponseDTO;
import com.was.personasapi.entity.Person;
import com.was.personasapi.repositories.PersonRepository;
import com.was.personasapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }
/*
    @GetMapping
    public List<PersonDTO> listAll(){
        return personService.listAll();
    }
  */

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}

