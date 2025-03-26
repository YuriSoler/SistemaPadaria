package dao;

import model.Produto;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {
    private final Conexao conexao = new Conexao();

    public boolean inserir(Produto produto) {
        try (Connection conn = conexao.conectar();
             PreparedStatement newRow = conn.prepareStatement("INSERT INTO produtos (nome, preco, idFornecedor) VALUES (?, ?, ?)")) {

            newRow.setString(1, produto.getNome());
            newRow.setFloat(2, produto.getPreco());
            newRow.setInt(3, produto.getIdFornecedor());

            int rowsAffected = newRow.executeUpdate();
            return rowsAffected > 0;

        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizar(Produto produto) {
        try (Connection conn = conexao.conectar();
             PreparedStatement rowUpdated = conn.prepareStatement("UPDATE produtos SET nome = ?, preco = ?, idFornecedor = ? WHERE idProduto = ?;")){

            rowUpdated.setString(1, produto.getNome());
            rowUpdated.setFloat(2, produto.getPreco());
            rowUpdated.setInt(3, produto.getIdFornecedor());
            rowUpdated.setInt(4, produto.getIdFornecedor());
            rowUpdated.setInt(5, produto.getIdProduto());

            int rowsAffected = rowUpdated.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean deletar(int id) {
        try(Connection conn = conexao.conectar();
            PreparedStatement rowDeleted = conn.prepareStatement("DELETE FROM produtos WHERE idProduto = ?;")) {

            rowDeleted.setInt(1, id);

            int rowsAffected = rowDeleted.executeUpdate();
            return rowsAffected > 0;

        } catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}
