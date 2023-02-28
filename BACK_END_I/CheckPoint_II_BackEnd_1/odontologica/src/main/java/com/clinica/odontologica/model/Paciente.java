package com.clinica.odontologica.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Paciente {
    private int id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String rg;
    private Date dataAlta;


}



