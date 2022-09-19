package com.example.injecao_Dependencia1.service;

import java.util.List;

public interface ILivroService<T> {

    public List<T> buscarTodosLivros();
}
