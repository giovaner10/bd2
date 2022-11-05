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

            preparador.setInt(1, codigo);

            preparador.setDouble(2, preco);

            System.out.println(preco);
            System.out.println(codigo);

            preparador.execute();

            preparador.close();

            System.out.println("atualizacao realizada com sucesso");

        } catch (SQLException e) {

            System.out.println("Erro - " + e.getMessage());

        }

    }
}
