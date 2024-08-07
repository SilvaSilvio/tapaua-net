package com.tapaua_net.Aplication.controller;

import com.tapaua_net.Aplication.entity.Adress;
import com.tapaua_net.Aplication.service.AdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/endereco")
public class AdressController {

    @Autowired
    private AdressService adressService;

    @PostMapping("/save")
    public ResponseEntity<Adress> saveEndereco(@RequestBody Adress obj){
        adressService.saveEndereco(obj);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/save/getall")
    public ResponseEntity<List<Adress>> getAllAdress(){
        List<Adress> alladress = adressService.getAllAdress();
        return ResponseEntity.ok( alladress );
    }

    @GetMapping("/save/getAdress/{id}")
    public ResponseEntity<Optional<Adress>> getAdressById(@PathVariable Long id){
        var adressById = adressService.getAdressById(id);
        return ResponseEntity.ok(adressById);
    }

    @DeleteMapping("deleteAdress/{id}")
    public ResponseEntity<Adress> deleteAdress(@PathVariable Long id) {
        adressService.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
