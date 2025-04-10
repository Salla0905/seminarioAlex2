package org.example.belleepoque.controller;

import org.example.belleepoque.model.Produto;
import org.example.belleepoque.model.Setor;
import org.example.belleepoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/produtos")
public class PrincipalController {

    @Autowired
    private ProdutoService produtoService;

    // Renderiza a página HTML
    @GetMapping
    public String home(Model model) {
        model.addAttribute("maisVendidos", produtoService.buscarMaisVendidos());
        model.addAttribute("lancamentos", produtoService.buscarLancamentos());
        return "index"; // Seu HTML original
    }

    // Endpoint API para Mais Vendidos (aleatórios)
    @GetMapping("/api/mais-vendidos")
    @ResponseBody
    public List<Produto> getMaisVendidos() {
        return produtoService.buscarMaisVendidos();
    }

    // Endpoint API para Lançamentos (aleatórios)
    @GetMapping("/api/lancamentos")
    @ResponseBody
    public List<Produto> getLancamentos() {
        return produtoService.buscarLancamentos();
    }
}