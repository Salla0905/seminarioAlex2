package Constructors;

//        TABELA: setor
public class Setor {
    private int id;
    private int tipo; // 1-roupas 2-calçados 3-bolsas 4-acessórios
    private int idProduto;

    public Setor(int id, int tipo, int idProduto) {
        this.id = id;
        this.tipo = tipo;
        this.idProduto = idProduto;
    }

    public int getId() {
        return this.id;
    }

    public int getTipo() {
        return this.tipo;
    }

    public int getIdProduto() {
        return this.idProduto;
    }
}
