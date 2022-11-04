package br.com.cesed.si.bd2.bd2;

import br.com.cesed.si.bd2.bd2.DAO.LivroDAO;
import br.com.cesed.si.bd2.bd2.entidades.Livro;

import java.sql.SQLException;

public class Console {
    public static void main(String[] args) {
        testaInsert();

    }
    public static void testaInsert(){
        Livro livro = new Livro(1, "JAVA", 55.0);

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
