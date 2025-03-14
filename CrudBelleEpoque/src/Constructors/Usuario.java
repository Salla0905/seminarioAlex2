package Constructors;

//        TABELA: usuario
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String endereco;
    private int tipo; // 1-cliente 2-admin
    private String status_cliente;

    public Usuario(int id, String nome, String email, String senha, String telefone, String endereco, int tipo, String status_cliente) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipo = tipo;
        this.status_cliente = status_cliente;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getTipo() {
        return this.tipo;
    }

    public String getStatus_cliente() {
        return this.status_cliente;
    }
}
