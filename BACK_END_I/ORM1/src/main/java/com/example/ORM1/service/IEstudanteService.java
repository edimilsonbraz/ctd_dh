package com.example.ORM1.service;

import java.util.List;
import java.util.Optional;

public interface IEstudanteService <T>{

    public T addEstudante(T t);
    public List<T> findAllEstudantes();
    public Optional<T> findEstudanteById(Long id);
    public String updateEstudante(T t);
    public String deleteEstudante(Long id);
}
