package br.com.cesed.si.bd2.bd2.conexao;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class Conecta {
    static final String URL = "jdbc:postgresql://localhost:5432/teste";
    static final String USER = "postgres";
    static final String PASS = "8718";


    public static Connection criarConexao() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver"); //driver

        Connection conecta = DriverManager.getConnection(URL, USER, PASS);

        if (conecta != null) {
            return conecta;
        }

        return null;
    }

}