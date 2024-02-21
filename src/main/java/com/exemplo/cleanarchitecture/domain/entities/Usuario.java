package com.exemplo.cleanarchitecture.domain.entities;

import com.exemplo.cleanarchitecture.domain.valueobjects.Email;

public class Usuario {
    private String nome;
    private Email email;

    public Usuario(String nome, Email email) {
        // Adicione outras validações de usuário, se necessário
        this.nome = nome;
        this.email = email;
    }
}
