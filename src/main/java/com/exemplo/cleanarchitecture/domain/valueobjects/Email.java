package com.exemplo.cleanarchitecture.domain.valueobjects;

public class Email {
    private final String endereco;

    public Email(String endereco) {
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereço de e-mail não pode ser nulo ou vazio");
        }

        this.endereco = endereco.toLowerCase();
    }

    public String getEndereco() {
        return endereco;
    }
}
