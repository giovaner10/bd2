package br.com.cesed.si.bd2.bd2.DAO;

import br.com.cesed.si.bd2.bd2.Conecta;
import br.com.cesed.si.bd2.bd2.entidades.Vendedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendedorDAO {

    private Connection con;

    public VendedorDAO() throws SQLException, ClassNotFoundException {

        con = Conecta.criarConexao();

    }
    public void insert(Vendedor vendedor) {
        String sql = "INSERT INTO vendedor(nome, telefone) VALUES(?,?)";
        try {

            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setString(1, vendedor.getNome());

            preparador.setString(2, vendedor.getTelefone());

            preparador.execute();

            preparador.close();


        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }
    }
}
