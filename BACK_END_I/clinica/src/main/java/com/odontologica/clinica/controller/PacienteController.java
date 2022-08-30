package com.odontologica.clinica.controller;

import com.odontologica.clinica.model.Paciente;
import com.odontologica.clinica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteService service;

    @PostMapping
    public Paciente salvaPaciente(@RequestBody Paciente paciente) throws SQLException {
        return service.salvar(paciente);
    }

    @PatchMapping
    public void alterar(@RequestBody Paciente paciente) throws SQLException {
        System.out.println();
        service.alterar(paciente);
    }

    @DeleteMapping
    public void excluir(@RequestParam("id") int id) throws SQLException {
        service.excluir(id);
    }
}
