package com.netsoul.beuga.Aplication.entity;

import jakarta.persistence.*;
import lombok.ToString;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;

@Entity(name = "documento")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    @Column(name = "numero_rg")
    private String identidade;
    @Column(name = "numero_chh")
    private String cnh;

    @OneToOne
    private Pessoa pessoa;

    public Documento(){}

    public Documento(String cpf, String identidade, String cnh, Pessoa pessoa) {
        this.cpf = cpf;
        this.identidade = identidade;
        this.cnh = cnh;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
