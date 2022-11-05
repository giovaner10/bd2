package br.com.cesed.si.bd2.bd2.service;

import br.com.cesed.si.bd2.bd2.DAO.LivroDAO;
import br.com.cesed.si.bd2.bd2.entidades.Livro;

import java.sql.SQLException;
import java.util.List;

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


    public static void livroUpdate(int codigo, double novoPreco){

        try {
            LivroDAO livroDAO = new LivroDAO();
            livroDAO.atualizarLivro(codigo, novoPreco);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void livroDelete(int codigo){

        try {
            LivroDAO livroDAO = new LivroDAO();
            livroDAO.deletarLivro(codigo);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static List<Livro> livroFindAll(){

        try {
            LivroDAO livroDAO = new LivroDAO();
            return livroDAO.listarLivro();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }



}
