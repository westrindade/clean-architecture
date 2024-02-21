package com.exemplo.cleanarchitecture.domain.valueobjects;

public class Cnpj {
    private final String numero;
    public Cnpj(String numero) {
        if (numero == null || !isValidCnpj(numero)) {
            throw new IllegalArgumentException("Número de CNPJ inválido");
        }
        this.numero = numero;
    }

    private boolean isValidCnpj(String numero) {
        return numero != null && numero.length() == 14;
    }

    public String getNumero() {
        return numero;
    }
}
