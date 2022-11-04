package br.com.cesed.si.bd2.bd2.DAO;

import br.com.cesed.si.bd2.bd2.Conecta;
import br.com.cesed.si.bd2.bd2.entidades.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {

    private Connection con;

    public LivroDAO() throws SQLException, ClassNotFoundException {

        con = Conecta.criarConexao();

    }


    public void adicionarLivro(Livro livro) {

        String sql = "INSERT INTO livro VALUES(?,?,?)";


        try {

            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setInt(1, livro.getCodigo());

            preparador.setString(2, livro.getTitulo());

            preparador.setString(3, String.valueOf(livro.getPreco()));

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

            preparador.setString(1, String.valueOf(preco));

            preparador.setString(2, String.valueOf(codigo));

            preparador.execute();

            preparador.close();

            System.out.println("atualizacao realizada com sucesso");

        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }

    }
}
