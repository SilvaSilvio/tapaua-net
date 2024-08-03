package com.tapaua_net.Aplication.service;

import com.tapaua_net.Aplication.entity.Adress;
import com.tapaua_net.Aplication.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

@Autowired
    private EnderecoRepository enderecoRepository;

public void saveEndereco(Adress endereco){
    enderecoRepository.save( endereco );
}


}
