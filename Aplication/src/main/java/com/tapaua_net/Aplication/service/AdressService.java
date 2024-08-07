package com.tapaua_net.Aplication.service;

import com.tapaua_net.Aplication.entity.Adress;
import com.tapaua_net.Aplication.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdressService {

@Autowired
    private AdressRepository adressRepository;

public void saveEndereco(Adress adress){
    adressRepository.save( adress );
}

public List<Adress> getAllAdress(){
    return adressRepository.findAll();
}

public Optional<Adress> getAdressById(Long id){
    return adressRepository.findById(id);
}

public void deleteById(Long id){
    adressRepository.deleteById(id);

}

}
