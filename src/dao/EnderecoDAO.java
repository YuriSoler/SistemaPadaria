package dao;

import model.Endereco;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnderecoDAO {
    private final Conexao conexao = new Conexao();

    public boolean inserir(Endereco endereco) {
        try (Connection conn = conexao.conectar();
             PreparedStatement newRow = conn.prepareStatement("INSERT INTO endereco (cep, logradouro, bairro, cidade, estado, numero, idCliente, idFornecedor) VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {

            newRow.setString(1, endereco.getCep());
            newRow.setString(2, endereco.getLogradouro());
            newRow.setString(3, endereco.getBairro());
            newRow.setString(4, endereco.getCidade());
            newRow.setString(5, endereco.getEstado());
            newRow.setString(6, endereco.getNumero());
            newRow.setInt(7, endereco.getIdCliente());
            newRow.setInt(8, endereco.getIdFornecedor());

            int rowsAffected = newRow.executeUpdate();
            return rowsAffected > 0;

        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizar(Endereco endereco) {
        try (Connection conn = conexao.conectar();
             PreparedStatement rowUpdated = conn.prepareStatement("UPDATE endereco SET cep = ?, logradouro = ?, bairro = ?, cidade = ?, estado = ?, numero = ?, idCliente = ?, idFornecedor = ? WHERE idEndereco = ?;")){

            rowUpdated.setString(1, endereco.getCep());
            rowUpdated.setString(2, endereco.getLogradouro());
            rowUpdated.setString(3, endereco.getBairro());
            rowUpdated.setString(4, endereco.getCidade());
            rowUpdated.setString(5, endereco.getEstado());
            rowUpdated.setString(6, endereco.getNumero());
            rowUpdated.setInt(7, endereco.getIdCliente());
            rowUpdated.setInt(8, endereco.getIdFornecedor());
            rowUpdated.setInt(9, endereco.getIdEndereco());

            int rowsAffected = rowUpdated.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean deletar(int id) {
        try(Connection conn = conexao.conectar();
            PreparedStatement rowDeleted = conn.prepareStatement("DELETE FROM endereco WHERE idEndereco = ?;")) {

            rowDeleted.setInt(1, id);

            int rowsAffected = rowDeleted.executeUpdate();
            return rowsAffected > 0;

        } catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}
