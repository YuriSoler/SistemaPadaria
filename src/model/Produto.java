package model;

public class Produto {
    private int idProduto, idFornecedor;
    private String nome;
    private float preco;

    public Produto(String nome, float preco, int idFornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.idFornecedor = idFornecedor;
    }

    public int getIdProduto() {return idProduto;}
    public void setIdProduto(int idProduto) {this.idProduto = idProduto;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public float getPreco() {return preco;}
    public void setPreco(float preco) {this.preco = preco;}

    public int getIdFornecedor() {return idFornecedor;}
    public void setIdFornecedor(int idFornecedor) {this.idFornecedor = idFornecedor;}
}
