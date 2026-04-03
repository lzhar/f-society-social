package com.luiz.fsociety.dto;

public class UsuarioResponseDTO {
    private String nome;
    private Integer idade;
    private String usuario;
    private String senha;


    public UsuarioResponseDTO(String nome, Integer idade, String usuario, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.usuario = usuario;
        this.senha = senha;
    }
}
