package com.was.personasapi.controller;

import com.was.personasapi.dto.request.PersonDTO;
import com.was.personasapi.dto.response.MessageResponseDTO;
import com.was.personasapi.entity.Person;
import com.was.personasapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
//Create Person
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }
//List all Person
    @GetMapping
    public List<PersonDTO> listAll(){
        return personService.listAll();
    }
}

