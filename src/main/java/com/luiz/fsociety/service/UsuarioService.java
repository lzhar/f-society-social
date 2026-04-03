package com.luiz.fsociety.service;

import com.luiz.fsociety.dto.UsuarioRequestDTO;
import com.luiz.fsociety.dto.UsuarioResponseDTO;
import com.luiz.fsociety.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public UsuarioResponseDTO cadastrarUsuario(UsuarioRequestDTO usuarioRequest){
        Usuario usuario = new Usuario(usuarioRequest.getNome(), usuarioRequest.getIdade(),
                usuarioRequest.getUsuario(), usuarioRequest.getSenha());


        //metodo para cadastrar no banco

        return new UsuarioResponseDTO(
                usuario.getNome(), usuario.getIdade(),
                usuario.getUsuario(), usuario.getSenha()
        );
    }
}
