package org.example.belleepoque.Controller;

import org.example.belleepoque.model.Carrinho;
import org.example.belleepoque.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
