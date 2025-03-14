package Constructors;

//        TABELA: produto
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private String cor;
    private String tamanho;
    private int quant_estoque;
    private String img;

    public Produto(int id, String nome, double preco, String cor, String tamanho, int quant_estoque, String img) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
        this.quant_estoque = quant_estoque;
        this.img = img;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getCor() {
        return this.cor;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public int getQuant_estoque() {
        return this.quant_estoque;
    }

    public String getImg() {
        return this.img;
    }
}
