package org.example.belleepoque.service;

import org.example.belleepoque.model.Usuario;
import org.example.belleepoque.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Método que o controller está chamando
    public boolean validarLogin(String email, String senha) {
        return usuarioRepository.findByEmailAndSenha(email, senha) != null;
    }

    public void cadastrarNovoUsuario(String nome, String email, String telefone, String senha) {
        if (usuarioRepository.existsByEmail(email)) {
            throw new RuntimeException("Email já cadastrado");
        }

        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nome);
        novoUsuario.setEmail(email);
        novoUsuario.setTelefone(telefone);
        novoUsuario.setSenha(senha);

        usuarioRepository.save(novoUsuario);
    }
}