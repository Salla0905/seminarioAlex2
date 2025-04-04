package org.example.belleepoque.controller;

import org.example.belleepoque.model.Usuario;
import org.example.belleepoque.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;
    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @GetMapping("/listar")
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }
    @PostMapping("/inserir")
    public ResponseEntity<Usuario> inserir(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuario);
    }
}
