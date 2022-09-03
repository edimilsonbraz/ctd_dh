package com.example.injecao_Dependencia1.repository;

import java.util.List;
public interface ILivroRepository<T>{
    public List<T> buscarTodosLivros();

}
