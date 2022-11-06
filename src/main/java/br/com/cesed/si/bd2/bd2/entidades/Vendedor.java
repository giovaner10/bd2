package br.com.cesed.si.bd2.bd2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vendedor {

    private int matricula;
    private String nome;
    private String telefone;

<<<<<<< HEAD
    public Vendedor(String nome, String telefone) {
=======
    public Vendedor(String nome, String telefone){
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221
        this.nome = nome;
        this.telefone = telefone;
    }
}
