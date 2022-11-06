package br.com.cesed.si.bd2.bd2.service;

import br.com.cesed.si.bd2.bd2.DAO.LivroDAO;
import br.com.cesed.si.bd2.bd2.DAO.VendedorDAO;
import br.com.cesed.si.bd2.bd2.entidades.Livro;
import br.com.cesed.si.bd2.bd2.entidades.Vendedor;

import java.sql.SQLException;

public class VendedorService {
    public static void insert(String nome, String telefone) {
        Vendedor vendedor = new Vendedor(nome, telefone);
        try {
            VendedorDAO vendedorDAO = new VendedorDAO();
            vendedorDAO.insert(vendedor);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
