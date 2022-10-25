package com.dh.dentista.service.impl;

import com.dh.dentista.ConfiguracaoJDBC;
import com.dh.dentista.Dao.UsuarioDaoH2;
import com.dh.dentista.model.Usuario;
import com.dh.dentista.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    UsuarioDaoH2 usuarioDaoH2 = new UsuarioDaoH2(new ConfiguracaoJDBC());

    @Override
    public List<Usuario> cadastrar() {
        List<Usuario> listaUsuario = new ArrayList<>();


        Usuario usuario1 = new Usuario("Nicholas", "nick@gmail.com", "123456", "adm");
        Usuario usuario2 = new Usuario("Guilherme", "gigi@gmail.com", "123456", "user");

        usuarioDaoH2.cadastrar(usuario1);
        usuarioDaoH2.cadastrar(usuario2);

        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);

        return listaUsuario;

    }

    @Override
    public Usuario buscar(int id) {

        return usuarioDaoH2.buscar(id);
    }

    @Override
    public String deletar(int id) {
        usuarioDaoH2.deletar(id);
        return "Usuário deletado";
    }
}
