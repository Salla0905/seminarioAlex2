package org.example.belleepoque.Controller;

import org.example.belleepoque.model.Usuario;
import org.example.belleepoque.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/buscarId")
    public ResponseEntity<Usuario> buscarPorId(@RequestParam("id") Integer id) {
        Optional<Usuario> usuario = usuarioRepository.findById(Long.valueOf(id));
        if (usuario.isPresent()) {
            return ResponseEntity.ok(usuario.get());
        }
        return ResponseEntity.notFound().build();
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Usuario> deletar(@PathVariable Integer id) {
        usuarioRepository.deleteById((long)id);
        return ResponseEntity.ok().build();
    }


}
