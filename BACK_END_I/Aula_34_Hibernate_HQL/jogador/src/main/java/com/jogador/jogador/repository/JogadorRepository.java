package com.jogador.jogador.repository;

import com.jogador.jogador.entity.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JogadorRepository extends JpaRepository<JogadorEntity, Long> {

    //Salvar Jogador
    public void salvarJogador(JogadorEntity jogadorEntity);

    //Buscar todos Jogadores
    public List<JogadorEntity> buscarTodosJogadores();

    //Buscar jogador por nome
    @Query("Select jogador j from Jogador where j.nome = ?1")
    public Optional<JogadorEntity> findJogadorByName(String nome);
}
