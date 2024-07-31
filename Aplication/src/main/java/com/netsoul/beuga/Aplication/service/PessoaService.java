package com.netsoul.beuga.Aplication.service;

import com.netsoul.beuga.Aplication.entity.Endereco;
import com.netsoul.beuga.Aplication.entity.Pessoa;
import com.netsoul.beuga.Aplication.repository.PessoaRepositoty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    public PessoaRepositoty pessoaRepositoty;

    public PessoaService(PessoaRepositoty pessoaRepositoty){
        this.pessoaRepositoty = pessoaRepositoty;
    }

    public Pessoa savePeople(Pessoa obj){
        pessoaRepositoty.save( obj );
//        return (Pessoa) listAllPeople();
        return obj;
    }

    public Pessoa saveEndereco(Long pessoaId, Endereco endereco){
        Pessoa pessoa =  pessoaRepositoty.findById(pessoaId).orElseThrow(()-> new RuntimeException("Pessoa não encontrada"));
        pessoa.addAdress( endereco );
        return pessoaRepositoty.save(pessoa);
    }

//    public Pessoa deleteEndereco(Long pessoaId, Endereco endereco){
//        Pessoa pessoa = pessoaRepositoty.findById(pessoaId).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
//        pessoa.deleteAdress(endereco);
//        return pessoaRepositoty.deleteById();
//    }

    public List<Pessoa> updatePeople(Pessoa obj){
       pessoaRepositoty.save(obj);
       return listAllPeople();
    }

    public void deletePeople(Long obj){
        pessoaRepositoty.deleteById(obj);
//        return listAllPeople();
    }

    public List<Pessoa> listAllPeople() {
        return pessoaRepositoty.findAll();
    }

    public Optional<Pessoa> findById(Long obj){
        return pessoaRepositoty.findById(obj);
    }


}
