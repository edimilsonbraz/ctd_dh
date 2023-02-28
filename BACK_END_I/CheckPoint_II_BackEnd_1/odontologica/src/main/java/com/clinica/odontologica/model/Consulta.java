package com.clinica.odontologica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Consulta {
    private Date data;
    private Date hora;
    private Dentista dentista;
    private Paciente paciente;
}
