package com.clinica.odontologica.controller;

import com.clinica.odontologica.model.Dentista;
import com.clinica.odontologica.service.DentistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

    @RestController
    @RequestMapping("/dentistas")
    public class DentistaController {

        @Autowired
        DentistaService service;

        @PostMapping
        public Dentista salvaDentista(@RequestBody Dentista dentista) throws SQLException {
            return service.salvar(dentista);
        }

        @PutMapping
        public void alterar(@RequestBody Dentista dentista) throws SQLException {
            System.out.println();
            service.alterar(dentista);
        }

        @GetMapping
        public List<Dentista> buscarTodos() throws SQLException {
            return service.buscarTodos();
        }

        @RequestMapping(value = "/buscaId")
        public Dentista buscarPorId(@RequestParam("id") int id) throws SQLException {
            return service.buscarPorId(id).isEmpty() ? new Dentista() : service.buscarPorId(id).get();
        }

        @DeleteMapping
        public void excluir(@RequestParam("id") int id) throws SQLException {
            service.excluir(id);
        }

    }

