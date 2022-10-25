package com.dh.ecommerce.service;

import com.dh.ecommerce.model.Cartao;
import com.dh.ecommerce.model.Endereco;

public interface ICompraService {

    public void processarCompra(String produtoId, Integer quantidade, Cartao cartao, Endereco endereco);
}
