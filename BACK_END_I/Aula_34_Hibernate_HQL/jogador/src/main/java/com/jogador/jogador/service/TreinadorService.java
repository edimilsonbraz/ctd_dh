package com.jogador.jogador.service;

import com.jogador.jogador.entity.TreinadorEntity;
import com.jogador.jogador.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinadorService {

    private TreinadorRepository treinadorRepository;

    @Autowired
    public TreinadorService(TreinadorRepository treinadorRepository) {
        this.treinadorRepository = treinadorRepository;
    }

    public List<TreinadorEntity> buscarTodos(){
        return treinadorRepository.findAll();
    }

    public TreinadorEntity buscarPorIdade(Integer idade){
        return treinadorRepository.findTreinadorByIdade(idade).get();
    }

}
