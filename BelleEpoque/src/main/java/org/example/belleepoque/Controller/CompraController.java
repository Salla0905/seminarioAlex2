package org.example.belleepoque.Controller;

import org.example.belleepoque.model.Compra;
import org.example.belleepoque.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
