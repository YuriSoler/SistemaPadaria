package model;

public class ItemPedido {
    private int idItemPedido, idPedido, idProduto, quantidade;
    private float precoUnitario;

    public ItemPedido(int idPedido, int idProduto, int quantidade, float precoUnitario) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public int getIdItemPedido() {return idItemPedido;}
    public void setIdItemPedido(int idItemPedido) {this.idItemPedido = idItemPedido;}

    public int getIdPedido() {return idPedido;}
    public void setIdPedido(int idPedido) {this.idPedido = idPedido;}

    public int getIdProduto() {return idProduto;}
    public void setIdProduto(int idProduto) {this.idProduto = idProduto;}

    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public float getPrecoUnitario() {return precoUnitario;}
    public void setPrecoUnitario(float precoUnitario) {this.precoUnitario = precoUnitario;}
}
