package org.example.belleepoque.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco;
    private String cor;
    private String tamanho;
    private int quantEstoque;
    private String imagem;
    private int idSetor;
    private String descricao;

    public Produto(){}

    public Produto(Long id, String nome, double preco, String cor, String tamanho, int quantEstoque, String imagem, int idSetor, String descricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantEstoque = quantEstoque;
        this.imagem = imagem;
        this.idSetor = idSetor;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", quantEstoque=" + quantEstoque +
                ", imagem='" + imagem + '\'' +
                ", idSetor=" + idSetor +
                ", descricao=" + descricao +
                '}';
    }
}
