package com.odontologica.clinica.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

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
    private String dataAlta;

}
