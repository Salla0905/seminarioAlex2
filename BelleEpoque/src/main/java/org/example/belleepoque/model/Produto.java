package org.example.belleepoque.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private double preco;
    private String cor;
    private String tamanho;
    private int quantEstoque;
    private String imagem;
    private int idSetor;
}
