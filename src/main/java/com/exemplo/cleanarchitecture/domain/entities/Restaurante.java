package com.exemplo.cleanarchitecture.domain.entities;

import com.exemplo.cleanarchitecture.domain.valueobjects.Cnpj;

public class Restaurante {
    private Cnpj cnpj;
    private String nome;
    private Endereco endereco;
    private String tipoCozinha;
    private String horariosFuncionamento;
    private int capacidade;
}
