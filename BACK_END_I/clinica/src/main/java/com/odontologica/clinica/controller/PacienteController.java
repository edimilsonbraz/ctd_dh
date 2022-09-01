package com.odontologica.clinica.controller;

import com.odontologica.clinica.model.Paciente;
import com.odontologica.clinica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteService service;

    @PostMapping
    public Paciente salvaPaciente(@RequestBody Paciente paciente) throws SQLException {
        return service.salvar(paciente);
    }

    @PutMapping
    public void alterar(@RequestBody Paciente paciente) throws SQLException {
        System.out.println();
        service.alterar(paciente);
    }

    @GetMapping
    public List<Paciente> buscarTodos() throws SQLException {
        return service.buscarTodos();
    }

    @RequestMapping(value = "/buscarId")
    public Paciente buscarPorId(@RequestParam("id") int id) throws SQLException {
        return service.buscarPorId(id).isEmpty() ? new Paciente() : service.buscarPorId(id).get();
    }


    @DeleteMapping
    public void excluir(@RequestParam("id") int id) throws SQLException {
        service.excluir(id);
    }
}
