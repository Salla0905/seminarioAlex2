package org.example.belleepoque.service;

import org.example.belleepoque.dto.ProdutoDTO;
import org.example.belleepoque.model.Produto;
import org.example.belleepoque.model.Setor;
import org.example.belleepoque.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoDTO buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .map(this::toDTO)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public List<ProdutoDTO> buscarRecomendacoes() {
        return produtoRepository.findAll().stream()
                .limit(5) // Limita a 5 recomendações
                .map(this::toDTO)
                .toList();
    }

    private ProdutoDTO toDTO(Produto produto) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setDescricao(produto.getDescricao());
        dto.setPreco(produto.getPreco());
        dto.setTamanhosDisponiveis(produto.getTamanho());
        dto.setImagemUrl("/imagens/produtos/" + produto.getImagem());
        // ⚠️ Não expõe o estoque se não for necessário
        // dto.setEstoque(produto.getEstoque());
        return dto;
    }


    private final Random random = new Random();

    public List<Produto> buscarMaisVendidos() {
        List<Produto> todos = produtoRepository.findAll();
        return selecionarAleatorios(todos, 4, "maisVendidos"); // Semente diferente
    }

    public List<Produto> buscarLancamentos() {
        List<Produto> todos = produtoRepository.findAll();
        return selecionarAleatorios(todos, 4, "lancamentos"); // Semente diferente
    }

    private List<Produto> selecionarAleatorios(List<Produto> produtos, int quantidade, String seed) {
        if (produtos.size() <= quantidade) return new ArrayList<>(produtos);

        // Usa a seed para garantir resultados diferentes por endpoint
        Collections.shuffle(produtos, new Random(seed.hashCode()));
        return produtos.subList(0, quantidade);
    }

}