package com.luiz.fsociety.controller;

import com.luiz.fsociety.dto.UsuarioRequestDTO;
import com.luiz.fsociety.model.Usuario;
import com.luiz.fsociety.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuarios")
    public String cadastrarUsuario(@RequestBody UsuarioRequestDTO usuario){
        usuarioService.cadastrarUsuario(usuario);
        return usuario.toString();
    }

}
