package com.example.MongoDB.service;

import com.example.MongoDB.model.TorneioModel;
import com.example.MongoDB.repository.TorneioRepository;

import java.util.List;

public class TorneioService {
    private TorneioRepository torneioRepository;

    public TorneioService(TorneioRepository torneioRepository){
        this.torneioRepository = torneioRepository;
    }
    public TorneioModel guardarTorneio(TorneioModel torneio){
        return torneioRepository.save(torneio);
    }

    public List<TorneioModel> listarTorneios(){
        return torneioRepository.findAll();
    }
}
