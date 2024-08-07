package com.tapaua_net.Aplication.controller;

import com.tapaua_net.Aplication.entity.Person;
import com.tapaua_net.Aplication.service.AdressService;
import com.tapaua_net.Aplication.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pessoa")
public class PersonController {

    @Autowired
    private PersonService pessoaService;
    private AdressService enderecoService;

    @PostMapping("/save")
    public ResponseEntity<Person> savePessoa(@RequestBody Person obj){
        Person pessoa = pessoaService.savePeople(obj) ; //pessoaService.sa
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findPeople")
    public ResponseEntity<List<Person>> getAllPeople(){
        var allPeople = pessoaService.listAllPeople();
        return ResponseEntity.ok(allPeople ) ;
    }

    @GetMapping("/findPersonById/{id}")
    public ResponseEntity<Optional<Person>> getPeopleById(@PathVariable Long id){
        var allPeople = pessoaService.findById(id);
        return ResponseEntity.ok(allPeople);
    }

    @DeleteMapping("/deletePerson/{id}")
    public ResponseEntity<Person> deletePeople(@PathVariable Long id){
        pessoaService.deletePeople(id);
        return ResponseEntity.ok().build();
    }
}
