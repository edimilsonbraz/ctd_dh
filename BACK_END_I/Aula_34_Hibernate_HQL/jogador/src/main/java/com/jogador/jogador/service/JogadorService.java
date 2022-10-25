package com.jogador.jogador.service;

import com.jogador.jogador.entity.JogadorEntity;
import com.jogador.jogador.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {
    private JogadorRepository jogadorRepository;

    @Autowired
    public JogadorService(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<JogadorEntity> buscarTodos() {

        return jogadorRepository.findAll();
    }

    public JogadorEntity buscarPorNome(String nome){
        return jogadorRepository.findJogadorByName(nome).get();
    }
}
