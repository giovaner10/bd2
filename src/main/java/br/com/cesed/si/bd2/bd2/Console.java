package br.com.cesed.si.bd2.bd2;

import br.com.cesed.si.bd2.bd2.service.LivroService;

import java.util.Scanner;


public class Console {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);


        while (true){
            System.out.println(
                            "1 - inserir livro\n" +
                            "2 - atualizar livro\n" +
                            "3 - Deletar livro\n" +
                            "999 - SAIR");

            int opcao = teclado.nextInt();


            if(opcao == 1){ //INSERIR LIVRO


                System.out.println("informe o nome do livro");
                String nome = teclado.next();

                System.out.println("informe o preco do livro");
                double preco = teclado.nextDouble();

                System.out.println("informe a quantidade de exemplares");
                int quantidade = teclado.nextInt();

                LivroService.livroInsert(nome,preco, quantidade);


            } else if (opcao == 2) { //UPDATE LIVRO
                LivroService.livroUpdate(2, 55);

            }
            else if (opcao == 3) { //UPDATE LIVRO
                System.out.println("informe o codigo do livro que deseja remover");
                int codigo = teclado.nextInt();
                LivroService.livroDelete(codigo);

            }
            else if (opcao == 999) { //SAIR DO SISTEMA
                System.out.println("Processando...");
                Thread.sleep(1300);
                System.out.println("App fechado!");
                break;
            }
        }




    }

}
