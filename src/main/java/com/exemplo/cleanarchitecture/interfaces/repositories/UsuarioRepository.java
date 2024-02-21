package com.exemplo.cleanarchitecture.interfaces.repositories;

import com.exemplo.cleanarchitecture.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    void save();
}
