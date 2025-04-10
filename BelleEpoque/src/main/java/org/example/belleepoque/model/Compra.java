package org.example.belleepoque.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
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

    public Compra(int id, int idCliente, int idProduto, int quantidade, Date dataCompra, double valorTotal, String status) {
        this.id = id;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.dataCompra = dataCompra;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public Compra() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", idCliente=" + idCliente +
                ", idProduto=" + idProduto +
                ", quantidade=" + quantidade +
                ", dataCompra=" + dataCompra +
                ", valorTotal=" + valorTotal +
                ", status='" + status + '\'' +
                '}';
    }
}
