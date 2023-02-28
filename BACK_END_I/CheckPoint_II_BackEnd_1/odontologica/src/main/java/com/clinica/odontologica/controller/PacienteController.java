package com.clinica.odontologica.controller;

import com.clinica.odontologica.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.clinica.odontologica.service.PacienteService;

import java.sql.SQLException;
import java.util.List;
      

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteService service;

    @PostMapping
    public Paciente salvaPaciente(@RequestBody Paciente paciente) throws SQLException{
        return service.salvar(paciente);
    }

    @GetMapping
    public List<Paciente> buscarTodos() throws SQLException{
        return service.buscarTodos();
    }

    @RequestMapping(value = "/buscaId")
    public Paciente buscarPorId(@RequestParam("id") int id) throws SQLException{
        return service.buscarPorId(id).isEmpty() ? new Paciente() : service.buscarPorId(id).get();
    }

    @PutMapping
    /*public void alterar(@RequestBody Paciente Paciente) throws SQLException{
        System.out.println();
        service.alterar(Paciente);
    }*/
    public ResponseEntity<Paciente> alterar(@RequestBody Paciente Paciente) throws SQLException{
        ResponseEntity responseEntity = null;
        if(service.buscarPorId(Paciente.getId())== null){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }


    @DeleteMapping
    /*
    public void excluir(@RequestParam("id") int id) throws SQLException{

        service.excluir(id);
    }*/

    public ResponseEntity excluir(@PathVariable Integer id) throws SQLException{
        ResponseEntity responseEntity = null;
        if(service.buscarPorId(id)==null){
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return responseEntity;
    }

}
