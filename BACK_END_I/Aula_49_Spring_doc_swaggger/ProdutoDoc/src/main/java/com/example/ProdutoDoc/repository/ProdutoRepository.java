package com.example.ProdutoDoc.repository;

import com.example.ProdutoDoc.model.ProdutoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<ProdutoModel, Integer> {
}
