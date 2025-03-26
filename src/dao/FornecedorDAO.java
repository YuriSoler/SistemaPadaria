package dao;

import model.Fornecedor;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FornecedorDAO {
    private final Conexao conexao = new Conexao();

    public boolean inserir(Fornecedor fornecedor) {
        try (Connection conn = conexao.conectar();
             PreparedStatement newRow = conn.prepareStatement("INSERT INTO fornecedor (nome, cnpj, telefone, email) VALUES (?, ?, ?, ?)")) {

            newRow.setString(1, fornecedor.getNome());
            newRow.setString(2, fornecedor.getCnpj());
            newRow.setString(3, fornecedor.getTelefone());
            newRow.setString(4, fornecedor.getEmail());

            int rowsAffected = newRow.executeUpdate();
            return rowsAffected > 0;

        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizar(Fornecedor fornecedor) {
        try (Connection conn = conexao.conectar();
             PreparedStatement rowUpdated = conn.prepareStatement("UPDATE fornecedor SET nome = ?, cnpj = ?, telefone = ?, email = ? WHERE idFornecedor = ?;")){

            rowUpdated.setString(1, fornecedor.getNome());
            rowUpdated.setString(2, fornecedor.getCnpj());
            rowUpdated.setString(3, fornecedor.getTelefone());
            rowUpdated.setString(4, fornecedor.getEmail());
            rowUpdated.setInt(5, fornecedor.getIdFornecedor());

            int rowsAffected = rowUpdated.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean deletar(int id) {
        try(Connection conn = conexao.conectar();
            PreparedStatement rowDeleted = conn.prepareStatement("DELETE FROM fornecedor WHERE idFornecedor = ?;")) {

            rowDeleted.setInt(1, id);

            int rowsAffected = rowDeleted.executeUpdate();
            return rowsAffected > 0;

        } catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}
