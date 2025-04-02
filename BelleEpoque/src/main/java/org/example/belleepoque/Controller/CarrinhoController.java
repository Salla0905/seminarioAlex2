package org.example.belleepoque.Controller;

import org.example.belleepoque.model.Carrinho;
import org.example.belleepoque.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
