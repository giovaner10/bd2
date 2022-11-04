package br.com.cesed.si.bd2.bd2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vendedor {

    private int matricula;
    private String nome;
    private String telefone;
}
