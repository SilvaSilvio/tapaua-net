package com.netsoul.beuga.Aplication.entity;

import com.netsoul.beuga.Aplication.records.RequestPessoa;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "pessoa")
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String lastname;
    private Integer age;
    private String sexo;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Endereco> adress = new ArrayList<>();

    @OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    private Documento documents;

    public void addAdress(Endereco endereco){
        adress.add(endereco);
        endereco.setPessoa( this );
    }

    public void removeAdress(Endereco endereco){
        adress.remove(endereco);
        endereco.setPessoa(null);
    }

    public void addDocuments(Documento documento){
        Documento d = new Documento();
    }

//    public Pessoa(RequestPessoa requestPessoa){
//        this.name = requestPessoa.name();
//        this.lastname = requestPessoa.lastname();
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Endereco> getAdress() {
        return adress;
    }

    public void setAdress(List<Endereco> adress) {
        this.adress = adress;
    }

    public Documento getDocuments() {
        return documents;
    }

    public void setDocuments(Documento documents) {
        this.documents = documents;
    }
}
