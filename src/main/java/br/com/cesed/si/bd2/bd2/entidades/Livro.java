package br.com.cesed.si.bd2.bd2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Livro {

    private int codigo;
    private String titulo;
    private double preco;
}
