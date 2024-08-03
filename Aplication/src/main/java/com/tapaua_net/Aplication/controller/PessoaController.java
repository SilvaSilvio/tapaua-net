package com.tapaua_net.Aplication.controller;

import com.tapaua_net.Aplication.entity.Adress;
import com.tapaua_net.Aplication.entity.Pessoa;
import com.tapaua_net.Aplication.service.EnderecoService;
import com.tapaua_net.Aplication.service.PessoaService;
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

    @PostMapping("/save/adress")
    public ResponseEntity<Pessoa> saveAdress(Long pessoaId, Adress endereco){
//    Pessoa pessoa = pessoaService
        return null;
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
