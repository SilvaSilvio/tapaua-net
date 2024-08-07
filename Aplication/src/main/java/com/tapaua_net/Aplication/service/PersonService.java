package com.tapaua_net.Aplication.service;

import com.tapaua_net.Aplication.entity.Adress;
import com.tapaua_net.Aplication.entity.Person;
import com.tapaua_net.Aplication.repository.PersonRepositoty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    public PersonRepositoty pessoaRepositoty;

    public PersonService(PersonRepositoty pessoaRepositoty){
        this.pessoaRepositoty = pessoaRepositoty;
    }

    public Person savePeople(Person obj){

        if (obj.getAdress() != null){
            for (Adress adress : obj.getAdress()){
                adress.setPessoa(obj);
            }
        }
        return pessoaRepositoty.save( obj );
    }

    public Person saveEndereco(Long pessoaId, Adress endereco){
        Person pessoa =  pessoaRepositoty.findById(pessoaId).orElseThrow(()-> new RuntimeException("Pessoa não encontrada"));
        pessoa.addAdress( endereco );
        return pessoaRepositoty.save(pessoa);
    }

//    public Pessoa deleteEndereco(Long pessoaId, Endereco endereco){
//        Pessoa pessoa = pessoaRepositoty.findById(pessoaId).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
//        pessoa.deleteAdress(endereco);
//        return pessoaRepositoty.deleteById();
//    }

    public List<Person> updatePeople(Person obj){
       pessoaRepositoty.save(obj);
       return listAllPeople();
    }

    public void deletePeople(Long obj){
        pessoaRepositoty.deleteById(obj);
//        return listAllPeople();
    }

    public List<Person> listAllPeople() {
        return pessoaRepositoty.findAll();
    }

    public Optional<Person> findById(Long obj){
        return pessoaRepositoty.findById(obj);
    }


}
