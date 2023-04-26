package com.example.study.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PersonController {
    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }
    @GetMapping("/persons")
    public Person consultAllPersons () {
        return (Person) repositoryPerson.findAll();
    }
 public Optional<Person> consulById (@PathVariable Long id){
        return repositoryPerson.findById(id);
 }

}
