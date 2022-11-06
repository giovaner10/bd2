package br.com.cesed.si.bd2.bd2.service;

import br.com.cesed.si.bd2.bd2.DAO.LivroDAO;
import br.com.cesed.si.bd2.bd2.DAO.VendedorDAO;
<<<<<<< HEAD
=======
import br.com.cesed.si.bd2.bd2.entidades.Livro;
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221
import br.com.cesed.si.bd2.bd2.entidades.Vendedor;

import java.sql.SQLException;

public class VendedorService {
<<<<<<< HEAD


    public static void vendedorInsert(String nome, String telefone) {
        Vendedor vendedor = new Vendedor(nome, telefone);

        try {
            VendedorDAO vendedorDAO = new VendedorDAO();
            vendedorDAO.adicionarVendedor(vendedor);
=======
    public static void insert(String nome, String telefone) {
        Vendedor vendedor = new Vendedor(nome, telefone);
        try {
            VendedorDAO vendedorDAO = new VendedorDAO();
            vendedorDAO.insert(vendedor);
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
<<<<<<< HEAD


    public static void vendedorUpdate(int matricula, String novoTelefone) {

        try {
            VendedorDAO vendedorDAO = new VendedorDAO();
            vendedorDAO.atualizarVendedor(matricula, novoTelefone);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void vendedorDelete(int matricula) {

        try {
            VendedorDAO vendedorDAO = new VendedorDAO();
            vendedorDAO.deletarVendedor(matricula);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void vendedorFindAll() {

        try {
            VendedorDAO vendedorDAO = new VendedorDAO();
            LivroDAO livroDAO = new LivroDAO();
            System.out.println();
            vendedorDAO.listarVendedor()
                    .forEach(
                            vendedor -> System.out.println(
                                    "matricula: " + vendedor.getMatricula()
                                            + " nome: " + vendedor.getNome()
                                            + " telefone: " + vendedor.getTelefone()));
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


=======
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221
}
