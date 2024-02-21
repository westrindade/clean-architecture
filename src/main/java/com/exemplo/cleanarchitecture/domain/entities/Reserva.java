package com.exemplo.cleanarchitecture.domain.entities;

import java.time.LocalDateTime;

public class Reserva {
    private Usuario usuario;
    private Restaurante restaurante;
    private LocalDateTime dataHora;
    private int quantidade;
}
