package org.example.belleepoque.controller;

import org.example.belleepoque.dto.ProdutoDTO;
import org.example.belleepoque.model.Produto;
import org.example.belleepoque.repository.ProdutoRepository;
import org.example.belleepoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private final  ProdutoRepository produtoRepository;
    private final ProdutoService produtoService;

    // Injeção via construtor (somente um construtor)
    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository, ProdutoService produtoService) {
        this.produtoRepository = produtoRepository;
        this.produtoService = produtoService;
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

    @GetMapping("/buscarId")
    public ResponseEntity<Produto> buscarPorId(@RequestParam Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        produtoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ProdutoDTO getProduto(@PathVariable Long id) {
        return produtoService.buscarPorId(id);
    }

    @GetMapping("/recomendacoes")
    public List<ProdutoDTO> getRecomendacoes() {
        return produtoService.buscarRecomendacoes();
    }
}
