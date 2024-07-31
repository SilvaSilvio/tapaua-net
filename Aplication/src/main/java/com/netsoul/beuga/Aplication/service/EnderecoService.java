package com.netsoul.beuga.Aplication.service;

import com.netsoul.beuga.Aplication.entity.Endereco;
import com.netsoul.beuga.Aplication.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

@Autowired
    private EnderecoRepository enderecoRepository;

public void saveEndereco(Endereco endereco){
    enderecoRepository.save( endereco );
}


}
