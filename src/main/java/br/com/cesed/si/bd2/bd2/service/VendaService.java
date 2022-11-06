package br.com.cesed.si.bd2.bd2.service;

import br.com.cesed.si.bd2.bd2.DAO.VendaDAO;
import br.com.cesed.si.bd2.bd2.entidades.Venda;

import java.sql.SQLException;

public class VendaService {


    public static void vendaInsert(int vendedor, int livro, int quantidade){
        Venda venda = new Venda(vendedor, livro, quantidade);

        System.out.println(venda.getCodigoLivro());

        try {
            VendaDAO vendaDAO = new VendaDAO();
            vendaDAO.adicionarVenda(venda);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    public static void vendaFindAll(){

        try {
            VendaDAO vendaDAO = new VendaDAO();
            System.out.println();
            vendaDAO.listarVenda()
                    .forEach(
                            venda -> System.out.println(
                                    "codigo: " + venda.getCodigo()
                                    + " vendedor: " + venda.getMatriculaVendedor()
                                    + " livro: " + venda.getCodigoLivro()
                                    + " quantidade " + venda.getQuantidade()));
            System.out.println();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
