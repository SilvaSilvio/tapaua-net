package com.tapaua_net.Aplication.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "pessoa")
@Table(name = "pessoa")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String lastname;
    private Integer age;
    private String sex;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private List<Adress> adress = new ArrayList<>();

    @OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    private Documento documents;

    public Person(){}

    public Person(Long id, String name, String lastname, Integer age, String sex, List<Adress> adress, Documento documents) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
        this.documents = documents;
    }

    public void addAdress(Adress endereco){
        adress.add(endereco);
        endereco.setPessoa( this );
    }

    public void removeAdress(Adress endereco){
        adress.remove(endereco);
        endereco.setPessoa(null);
    }

    public void addDocuments(Documento documento){
        Documento d = new Documento();
    }

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
        return sex;
    }

    public void setSexo(String sexo) {
        this.sex = sexo;
    }

    public List<Adress> getAdress() {
        return adress;
    }

    public void setAdress(List<Adress> adress) {
        this.adress = adress;
    }

    public Documento getDocuments() {
        return documents;
    }

    public void setDocuments(Documento documents) {
        this.documents = documents;
    }
}
