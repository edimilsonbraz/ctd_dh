package com.odontologica.clinica.dao;

import com.odontologica.clinica.model.Paciente;

import java.sql.SQLException;

public interface IDao<T> {

    Paciente salvar(Paciente paciente) throws SQLException;

    public void alterar(T t) throws SQLException;

    public void excluir(int id) throws SQLException;
}
