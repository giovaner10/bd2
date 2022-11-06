package br.com.cesed.si.bd2.bd2.DAO;

<<<<<<< HEAD
import br.com.cesed.si.bd2.bd2.conexao.Conecta;
=======
import br.com.cesed.si.bd2.bd2.Conecta;
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221
import br.com.cesed.si.bd2.bd2.entidades.Vendedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
<<<<<<< HEAD
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
=======
import java.sql.SQLException;
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221

public class VendedorDAO {

    private Connection con;

    public VendedorDAO() throws SQLException, ClassNotFoundException {

        con = Conecta.criarConexao();

    }
<<<<<<< HEAD


    public void adicionarVendedor(Vendedor vendedor) {

        String sql = "INSERT INTO vendedor(nome, telefone) VALUES(?,?)";


=======
    public void insert(Vendedor vendedor) {
        String sql = "INSERT INTO vendedor(nome, telefone) VALUES(?,?)";
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221
        try {

            PreparedStatement preparador = con.prepareStatement(sql);

<<<<<<< HEAD

=======
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221
            preparador.setString(1, vendedor.getNome());

            preparador.setString(2, vendedor.getTelefone());

            preparador.execute();

            preparador.close();

<<<<<<< HEAD
            System.out.println("Inserção do vendedor realizada!");
=======
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221

        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }
<<<<<<< HEAD

    }


    public void atualizarVendedor(int matricula, String novoTelefone) {

        String sql = "UPDATE vendedor SET telefone = ? WHERE matricula = ?";


        try {

            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setInt(2, matricula);

            preparador.setString(1, novoTelefone);

            preparador.execute();

            preparador.close();

            System.out.println("atualizacao do funcionario realizada com sucesso");

        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }

    }



    public void deletarVendedor(int matricula) {

        String sql = "DELETE FROM vendedor WHERE matricula = ?";


        try {

            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setInt(1, matricula);

            preparador.execute();

            preparador.close();

            System.out.println("delecao do vendedor realizada com sucesso");

        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }

    }



    public List<Vendedor> listarVendedor() {

        String sql = "SELECT * FROM vendedor";

        List<Vendedor> vendedorList = new ArrayList<>();

        try {

            PreparedStatement preparador = con.prepareStatement(sql);
            ResultSet resultSet = preparador.executeQuery();

            while (resultSet.next()){

                Vendedor novoVendedor = new Vendedor(resultSet.getInt("matricula")
                        , resultSet.getString("nome")
                        ,resultSet.getString("telefone"));

                vendedorList.add(novoVendedor);
            }

        } catch (SQLException e) {
            System.out.println("Erro - " + e.getMessage());
        }

        return vendedorList;
=======
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221
    }
}
