package com.dh.dentista.service;

import com.dh.dentista.model.Usuario;

import java.util.List;

public interface UsuarioService {
    public List<Usuario> cadastrar();

    public Usuario buscar(int id);

    public String deletar(int id);
}
