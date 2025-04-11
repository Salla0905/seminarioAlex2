package org.example.belleepoque.dto;

import java.util.List;

public class ProdutoDTO {
    private Long id;
    private String nome;
    private String descricao;
    private double preco;
    private String tamanhosDisponiveis;
    private Integer estoque;
    private String imagemUrl;

    public ProdutoDTO(Long id, String nome, String descricao, double preco, String tamanhosDisponiveis, Integer estoque, String imagemUrl) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanhosDisponiveis = tamanhosDisponiveis;
        this.estoque = estoque;
        this.imagemUrl = imagemUrl;
    }

    public ProdutoDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTamanhosDisponiveis() {
        return tamanhosDisponiveis;
    }

    public void setTamanhosDisponiveis(String tamanhosDisponiveis) {
        this.tamanhosDisponiveis = tamanhosDisponiveis;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
}