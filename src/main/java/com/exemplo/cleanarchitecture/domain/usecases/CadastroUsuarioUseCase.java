package com.exemplo.cleanarchitecture.domain.usecases;

import com.exemplo.cleanarchitecture.domain.entities.Usuario;
import com.exemplo.cleanarchitecture.domain.valueobjects.Email;
import com.exemplo.cleanarchitecture.interfaces.dto.UsuarioDTO;
import com.exemplo.cleanarchitecture.interfaces.repositories.UsuarioRepository;

public class CadastroUsuarioUseCase {
    private final UsuarioRepository usuarioRepository;

    public CadastroUsuarioUseCase(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrarNovoUsuario(UsuarioDTO usuarioDTO) {
        Usuario novoUsuario = new Usuario(usuarioDTO.getNome(), new Email(usuarioDTO.getEmail()));
        usuarioRepository.save(novoUsuario);
    }
}
