package com.dh.dentista.controller;

import com.dh.dentista.model.Usuario;
import com.dh.dentista.service.impl.UsuarioServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioServiceImpl usuarioService;

    public UsuarioController(UsuarioServiceImpl usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/cadastro")
    public List<Usuario> cadastrar(){
        return usuarioService.cadastrar();
    }

    @RequestMapping(value = "/buscar", method = RequestMethod.GET)
    public Usuario buscar(Model model, @RequestParam("id") int id) {
        return usuarioService.buscar(id);
    }

    @RequestMapping(value = "/deletar", method = RequestMethod.GET)
    public String deletar(Model model, @RequestParam("id") int id){
        return usuarioService.deletar(id);
    }
}
