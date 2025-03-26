package dao;

import model.ItemPedido;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ItemPedidoDAO {
    private final Conexao conexao = new Conexao();

    public boolean inserir(ItemPedido itemPedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement newRow = conn.prepareStatement("INSERT INTO itenspedidos (idPedido, idProduto, quantidade, precoUnitario) VALUES (?, ?, ?, ?)")) {

            newRow.setInt(1, itemPedido.getIdPedido());
            newRow.setInt(2, itemPedido.getIdProduto());
            newRow.setInt(3, itemPedido.getQuantidade());
            newRow.setFloat(4, itemPedido.getPrecoUnitario());

            int rowsAffected = newRow.executeUpdate();
            return rowsAffected > 0;

        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizar(ItemPedido itemPedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement rowUpdated = conn.prepareStatement("UPDATE itenspedidos SET idPedido = ?, idProduto = ?, quantidade = ?, precoUnitario = ? WHERE idItemPedido = ?;")){

            rowUpdated.setInt(1, itemPedido.getIdPedido());
            rowUpdated.setInt(2, itemPedido.getIdProduto());
            rowUpdated.setInt(3, itemPedido.getQuantidade());
            rowUpdated.setFloat(4, itemPedido.getPrecoUnitario());
            rowUpdated.setInt(5, itemPedido.getIdItemPedido());

            int rowsAffected = rowUpdated.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean deletar(int id) {
        try(Connection conn = conexao.conectar();
            PreparedStatement rowDeleted = conn.prepareStatement("DELETE FROM itenspedidos WHERE idItemPedido = ?;")) {

            rowDeleted.setInt(1, id);

            int rowsAffected = rowDeleted.executeUpdate();
            return rowsAffected > 0;

        } catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}
