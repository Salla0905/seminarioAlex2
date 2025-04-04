package org.example.belleepoque.Controller;

import org.example.belleepoque.model.Produto;
import org.example.belleepoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final ProdutoRepository produtoRepository;
    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    @GetMapping("/listar")
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }
    @PostMapping("/inserir")
    public ResponseEntity<Produto> inserir(@RequestBody Produto produto) {
        produtoRepository.save(produto);
        return ResponseEntity.ok(produto);
    }
}
