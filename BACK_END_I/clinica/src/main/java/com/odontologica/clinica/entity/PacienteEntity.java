package com.odontologica.clinica.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter

@Entity
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String rg;
    private Date dataAlta;

    public PacienteEntity(Long id, String nome, String sobrenome, String endereco, String rg, Date dataAlta) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.rg = rg;
        this.dataAlta = dataAlta;
    }

    public PacienteEntity(String nome, String sobrenome, String endereco, String rg, Date dataAlta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.rg = rg;
        this.dataAlta = dataAlta;
    }

    public PacienteEntity() {
    }
}