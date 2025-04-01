package org.example.belleepoque.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int idCliente;
    private int idProduto;
    private int quantidade;
    private Date dataCompra;
    private double valorTotal;
    private String status;
}
