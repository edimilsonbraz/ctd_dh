package com.example.injecao_Dependencia1.controller;

import com.example.injecao_Dependencia1.entity.LivroEntity;
import com.example.injecao_Dependencia1.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivroController {

    @Autowired
    private ILivroService livroService;

    @GetMapping("/livros")
    public List<LivroEntity> buscarTodosLivros(){
        return livroService.buscarTodosLivros();
    }
}
