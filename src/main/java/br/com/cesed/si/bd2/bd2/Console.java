package br.com.cesed.si.bd2.bd2;

import br.com.cesed.si.bd2.bd2.service.LivroService;

import java.util.Scanner;


public class Console {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);





        while (true){
            System.out.println(
                    "1 - inserir livro\n" +
                    "999 - SAIR");

            int opcao = teclado.nextInt();


            if(opcao == 1){ //INSERIR LIVRO
                System.out.println("informe o codigo do livro");
                int codigo = teclado.nextInt();

                System.out.println("informe o nome do livro");
                String nome = teclado.next();

                System.out.println("informe o preco do livro");
                double preco = teclado.nextDouble();

                LivroService.testaInsert(codigo,nome,preco);


            } else if (opcao == 999) { //SAIR DO SISTEMA
                System.out.println("Processando...");
                Thread.sleep(1300);
                System.out.println("App fechado!");
                break;
            }
        }




    }

}
