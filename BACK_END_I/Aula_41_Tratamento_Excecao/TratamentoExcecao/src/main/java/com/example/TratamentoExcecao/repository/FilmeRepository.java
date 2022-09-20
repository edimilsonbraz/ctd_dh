package com.example.TratamentoExcecao.repository;

import com.example.TratamentoExcecao.model.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeModel, Integer> {
}
