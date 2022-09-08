package com.jogador.jogador.repository;

import com.jogador.jogador.entity.TreinadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TreinadorRepository extends JpaRepository<TreinadorEntity, Long> {

    @Query("Select treinador t from Treinador where t.idade = ?1")
    public Optional<TreinadorEntity> findTreinadorByIdade(Integer idade);
}
