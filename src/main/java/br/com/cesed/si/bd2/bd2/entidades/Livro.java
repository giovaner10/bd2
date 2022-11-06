package br.com.cesed.si.bd2.bd2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Livro {


    private int codigo;
    private String titulo;
    private double preco;
    private int estoque;


    public Livro(String titulo, double preco, int estoque) {
        this.titulo = titulo;
        this.preco = preco;
        this.estoque = estoque;
    }
}
