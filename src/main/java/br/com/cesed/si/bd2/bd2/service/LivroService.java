package br.com.cesed.si.bd2.bd2.service;

import br.com.cesed.si.bd2.bd2.DAO.LivroDAO;
import br.com.cesed.si.bd2.bd2.entidades.Livro;

import java.sql.SQLException;

public class LivroService {


    public static void livroInsert(String nome, double preco, int estoque){
        Livro livro = new Livro(nome, preco, estoque);

        try {
            LivroDAO livroDAO = new LivroDAO();
            livroDAO.adicionarLivro(livro);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void livroUpdate(int codigo, int novoPreco){

        try {
            LivroDAO livroDAO = new LivroDAO();
            livroDAO.atualizarLivro(codigo, novoPreco);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
