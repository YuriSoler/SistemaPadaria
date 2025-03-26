package dao;

import model.Pedido;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PedidoDAO {
    private final Conexao conexao = new Conexao();

    public boolean inserir(Pedido pedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement newRow = conn.prepareStatement("INSERT INTO pedidos (dataPedido, statusPedido, idCliente) VALUES (?, ?, ?)")) {

            newRow.setDate(1, pedido.getDataPedido());
            newRow.setString(2, pedido.getStatusPedido());
            newRow.setInt(3, pedido.getIdCliente());

            int rowsAffected = newRow.executeUpdate();
            return rowsAffected > 0;

        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizar(Pedido pedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement rowUpdated = conn.prepareStatement("UPDATE pedidos SET dataPedido = ?, statusPedido = ?, idCliente = ? WHERE idPedido = ?;")){

            rowUpdated.setDate(1, pedido.getDataPedido());
            rowUpdated.setString(2, pedido.getStatusPedido());
            rowUpdated.setInt(3, pedido.getIdCliente());
            rowUpdated.setInt(4, pedido.getIdPedido());

            int rowsAffected = rowUpdated.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean deletar(int id) {
        try(Connection conn = conexao.conectar();
            PreparedStatement rowDeleted = conn.prepareStatement("DELETE FROM pedidos WHERE idPedido = ?;")) {

            rowDeleted.setInt(1, id);

            int rowsAffected = rowDeleted.executeUpdate();
            return rowsAffected > 0;

        } catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}
