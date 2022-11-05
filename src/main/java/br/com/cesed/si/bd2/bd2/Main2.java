package br.com.cesed.si.bd2.bd2;

import br.com.cesed.si.bd2.bd2.service.LivroService;

public class Main2 {
    public static void main(String[] args) {
        LivroService.livroFindAll().forEach(livro -> System.out.println(livro.getTitulo()));





    }
}
