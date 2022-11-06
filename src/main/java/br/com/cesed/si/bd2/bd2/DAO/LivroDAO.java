package br.com.cesed.si.bd2.bd2.DAO;

import br.com.cesed.si.bd2.bd2.conexao.Conecta;
import br.com.cesed.si.bd2.bd2.entidades.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    private Connection con;

    public LivroDAO() throws SQLException, ClassNotFoundException {

        con = Conecta.criarConexao();

    }


    public void adicionarLivro(Livro livro) {

        String sql = "INSERT INTO livro(titulo, preco, estoque) VALUES(?,?,?)";


        try {

            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setString(1, livro.getTitulo());

            preparador.setDouble(2, livro.getPreco());

            preparador.setInt(3, livro.getEstoque());

            preparador.execute();

            preparador.close();

            System.out.println("Inserção realizada do livro realizada!");

        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }

    }


    public void atualizarLivro(int codigo, double preco) {

        String sql = "UPDATE livro SET preco = ? WHERE codigo = ?";


        try {

            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setInt(2, codigo);

            preparador.setDouble(1, preco);

            System.out.println(preco);
            System.out.println(codigo);

            preparador.execute();

            preparador.close();

            System.out.println("atualizacao realizada com sucesso");

        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }

    }



    public void deletarLivro(int codigo) {

        String sql = "DELETE FROM livro WHERE codigo = ?";


        try {

            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setInt(1, codigo);

            preparador.execute();

            preparador.close();

            System.out.println("atualizacao realizada com sucesso");

        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }

    }



    public List<Livro> listarLivro() {

        String sql = "SELECT * FROM livro";

        List<Livro> livroList = new ArrayList<>();

        try {

            PreparedStatement preparador = con.prepareStatement(sql);
            ResultSet resultSet = preparador.executeQuery();

            while (resultSet.next()){

                Livro novoLivro = new Livro(resultSet.getInt("codigo")
                        , resultSet.getString("titulo")
                        ,resultSet.getDouble("preco")
                        ,resultSet.getInt("estoque"));

                livroList.add(novoLivro);
            }

        } catch (SQLException e) {
            System.out.println("Erro - " + e.getMessage());
        }

        return livroList;
    }
}
