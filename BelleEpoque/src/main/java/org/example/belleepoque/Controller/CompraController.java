package org.example.belleepoque.controller;

import org.example.belleepoque.model.Compra;
import org.example.belleepoque.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compra")
public class CompraController {
    private final CompraRepository compraRepository;
    @Autowired
    public CompraController(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }
    @GetMapping("/listar")
    public List<Compra> listar() {
        return compraRepository.findAll();
    }
    @PostMapping("/inserir")
    public ResponseEntity<Compra> inserir(@RequestBody Compra compra) {
        compraRepository.save(compra);
        return ResponseEntity.ok(compra);
    }
    @GetMapping("/buscarId")
    public ResponseEntity<Compra> buscarPorId(@RequestParam int id) {
        Optional<Compra> compra = compraRepository.findById((long) id);
        if (compra.isPresent()) {
            return ResponseEntity.ok(compra.get());
        }
        return ResponseEntity.notFound().build();
    }
}
