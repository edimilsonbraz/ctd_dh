package com.clinica.odontologica.service;

import com.clinica.odontologica.dao.IDao;
import com.clinica.odontologica.dao.impl.PacienteDAOH2;
import com.clinica.odontologica.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    IDao<Paciente> PacienteDaoH2;

    public Paciente salvar(Paciente Paciente) throws SQLException{
        return PacienteDaoH2.salvar(Paciente);
    }

    public List<Paciente> buscarTodos() throws SQLException{
        return PacienteDaoH2.buscarTodos();
    }

    public void alterar(Paciente Paciente) throws SQLException{
        PacienteDaoH2.alterar(Paciente);
    }

    public void excluir(int id) throws SQLException{
        PacienteDaoH2.excluir(id);
    }

    public Optional<Paciente> buscarPorId(int id) throws SQLException{
        return PacienteDaoH2.buscarPorId(id);
    }
}
