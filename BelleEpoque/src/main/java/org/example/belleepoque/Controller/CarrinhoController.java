package org.example.belleepoque.controller;

import org.example.belleepoque.model.Carrinho;
import org.example.belleepoque.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
    private final CarrinhoRepository carrinhoRepository;
    @Autowired
    public CarrinhoController(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }
    @GetMapping("/listar")
    public List<Carrinho> listar() {
        return carrinhoRepository.findAll();
    }
    @PostMapping("/inserir")
    public ResponseEntity<Carrinho> inserir(@RequestBody Carrinho carrinho) {
        carrinhoRepository.save(carrinho);
        return ResponseEntity.ok(carrinho);
    }
    @GetMapping("/buscarId")
    public ResponseEntity<Carrinho> buscarId(@RequestParam int id) {
        Optional<Carrinho> carrinho = carrinhoRepository.findById((long)id);
        if (carrinho.isPresent()) {
            return ResponseEntity.ok(carrinho.get());
        }
        return ResponseEntity.notFound().build();
    }
}
