package com.tapaua_net.Aplication.controller;

import com.tapaua_net.Aplication.entity.Adress;
import com.tapaua_net.Aplication.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Adress saveEndereco(@RequestBody Adress obj){
        enderecoService.saveEndereco(obj);

        return null;
    }
}
