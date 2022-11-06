package br.com.cesed.si.bd2.bd2.DAO;

import br.com.cesed.si.bd2.bd2.conexao.Conecta;
import br.com.cesed.si.bd2.bd2.entidades.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {

    private Connection con;

    public VendaDAO() throws SQLException, ClassNotFoundException {

        con = Conecta.criarConexao();

    }


    public void adicionarVenda(Venda venda) {

        String sql = "INSERT INTO venda(matriculaVendedor, codigoLivro, quantidade) VALUES(?,?,?)";




        try {

            PreparedStatement preparador = con.prepareStatement(sql);


            preparador.setInt(1, venda.getMatriculaVendedor());

            preparador.setInt(2, 6);

            preparador.setInt(3, venda.getQuantidade());


            preparador.execute();

            preparador.close();

            System.out.println("Venda realizada!");

        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }

    }


    public List<Venda> listarVenda() {

        String sql = "SELECT * FROM venda";

        List<Venda> vendaList = new ArrayList<>();

        try {

            PreparedStatement preparador = con.prepareStatement(sql);
            ResultSet resultSet = preparador.executeQuery();

            while (resultSet.next()){

                Venda novoVenda = new Venda(resultSet.getInt("codigo")
                        , resultSet.getInt("matriculaVendedor")
                        ,resultSet.getInt("codigoLivro")
                        ,resultSet.getInt("quantidade"));


                        vendaList.add(novoVenda);
            }

        } catch (SQLException e) {
            System.out.println("Erro - " + e.getMessage());
        }

        return vendaList;
    }
}
