package Constructors;

//        TABELA: carrinho
public class Carrinho {
    private int id;
    private int idCliente;
    private int idProduto;
    private int quantidade;

    public Carrinho(int id, int idCliente, int idProduto, int quantidade) {
        this.id = id;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return this.id;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public int getIdProduto() {
        return this.idProduto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
