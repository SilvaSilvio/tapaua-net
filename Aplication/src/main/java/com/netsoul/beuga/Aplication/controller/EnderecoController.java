package com.netsoul.beuga.Aplication.controller;

import com.netsoul.beuga.Aplication.entity.Endereco;
import com.netsoul.beuga.Aplication.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/save")
    public Endereco saveEndereco(@RequestBody Endereco obj){
        enderecoService.saveEndereco(obj);

        return null;
    }
}
