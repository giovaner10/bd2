package br.com.cesed.si.bd2.bd2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Venda {

    private int codigo;
    private int matriculaVendedor;
    private int codigoLivro;
    private int quantidade;

    public Venda(int matriculaVendedor, int codigoLivro, int quantidade) {
        this.matriculaVendedor = matriculaVendedor;
        this.codigoLivro = codigoLivro;
        this.quantidade = quantidade;
    }
}


