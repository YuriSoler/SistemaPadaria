package model;

public class Endereco {
    private int idEndereco, idCliente, idFornecedor;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(int idCliene, int idFornecedor, String estado, String logradouro, String numero, String bairro, String cidade, String cep) {
        this.estado = estado;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.idCliente = idCliene;
        this.idFornecedor = idFornecedor;
        this.cep = cep;
    }

    public int getIdEndereco() {return idEndereco;}
    public void setIdEndereco(int idEndereco) {this.idEndereco = idEndereco;}

    public int getIdCliente() {return idCliente;}
    public void setIdCliente(int idCliente) {this.idCliente = idCliente;}

    public int getIdFornecedor() {return idFornecedor;}
    public void setIdFornecedor(int idFornecedor) {this.idFornecedor = idFornecedor;}

    public String getCep() {return cep;}
    public void setCep(String cep) {this.cep = cep;}

    public String getLogradouro() {return logradouro;}
    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}

    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}

    public String getBairro() {return bairro;}
    public void setBairro(String bairro) {this.bairro = bairro;}

    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}

    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
}
