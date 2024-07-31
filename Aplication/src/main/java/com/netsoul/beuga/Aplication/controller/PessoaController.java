package com.netsoul.beuga.Aplication.controller;

import com.netsoul.beuga.Aplication.entity.Pessoa;
import com.netsoul.beuga.Aplication.service.EnderecoService;
import com.netsoul.beuga.Aplication.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
    private EnderecoService enderecoService;

    @PostMapping("/save")
    public ResponseEntity<Pessoa> savePessoa(@RequestBody Pessoa obj){
        Pessoa pessoa = pessoaService.savePeople(obj) ; //pessoaService.sa
        return ResponseEntity.ok(pessoa);
    }

    @GetMapping("/getPeople")
    public ResponseEntity<List<Pessoa>> listAllPeople(){
        var allPeople = pessoaService.listAllPeople();
        return ResponseEntity.ok(allPeople ) ;
    }

    @GetMapping("/getPeople/{id}")
    public ResponseEntity<Optional<Pessoa>> listAllPeople(@PathVariable Long id){
        var allPeople = pessoaService.findById(id);
        return ResponseEntity.ok(allPeople);
    }

    @DeleteMapping("/deletePerson/{id}")
    public ResponseEntity<Pessoa> deletePeople(@PathVariable Long id){
        pessoaService.deletePeople(id);
        return ResponseEntity.ok().build();
    }
}
