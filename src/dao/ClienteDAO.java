package dao;

import model.Cliente;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {
    private final Conexao conexao = new Conexao();

    public boolean inserir(Cliente cliente) {
        try (Connection conn = conexao.conectar();
             PreparedStatement newRow = conn.prepareStatement("INSERT INTO clientes (nome, email, telefone) VALUES (?, ?, ?)")) {
            newRow.setString(1, cliente.getNome());
            newRow.setString(2, cliente.getEmail());
            newRow.setString(3, cliente.getTelefone());

            int rowsAffected = newRow.executeUpdate();
            return rowsAffected > 0;

        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizar(Cliente cliente) {
        try (Connection conn = conexao.conectar();
             PreparedStatement rowUpdated = conn.prepareStatement("UPDATE clientes SET nome = ?, cpf = ?, telefone = ?, email = ? WHERE idCliente = ?;")){

            rowUpdated.setString(1, cliente.getNome());
            rowUpdated.setString(2, cliente.getCpf());
            rowUpdated.setString(3, cliente.getTelefone());
            rowUpdated.setString(4, cliente.getEmail());
            rowUpdated.setInt(5, cliente.getIdCliente());

            int rowsAffected = rowUpdated.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean deletar(int id) {
        try(Connection conn = conexao.conectar();
            PreparedStatement rowDeleted = conn.prepareStatement("DELETE FROM clientes WHERE idCliente = ?;")) {

            rowDeleted.setInt(1, id);

            int rowsAffected = rowDeleted.executeUpdate();
            return rowsAffected > 0;

        } catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}
