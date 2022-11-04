package br.com.cesed.si.bd2.bd2.service;

import br.com.cesed.si.bd2.bd2.DAO.LivroDAO;
import br.com.cesed.si.bd2.bd2.entidades.Livro;

import java.sql.SQLException;

public class LivroService {


    public static void testaInsert(int codigo, String nome, double preco){
        Livro livro = new Livro(codigo, nome, preco);

        try {
            LivroDAO livroDAO = new LivroDAO();
            livroDAO.adicionarLivro(livro);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
