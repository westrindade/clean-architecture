package com.exemplo.cleanarchitecture.interfaces.dto;

import com.exemplo.cleanarchitecture.domain.valueobjects.Email;

public record UsuarioDTO (
        String nome,
        String email
){

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }
}
