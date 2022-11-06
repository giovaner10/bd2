package br.com.cesed.si.bd2.bd2;

import br.com.cesed.si.bd2.bd2.entidades.Livro;
import br.com.cesed.si.bd2.bd2.service.LivroService;
import br.com.cesed.si.bd2.bd2.service.VendedorService;

import java.util.List;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);


        while (true){
            System.out.println("\n" +
                            "1 - Inserir livro\n" +
                            "2 - Atualizar livro\n" +
                            "3 - Deletar livro\n" +
                            "4 - Listar todos os livros\n" +
                            "5 - Inserir vendedor\n" +
                            "6 - Atualizar vendedor\n" +
                            "7 - Deletar vendedor\n" +
                            "8 - Listar todos os vendedores\n" +
                            "999 - SAIR" +
                            "\n");

            int opcao = Integer.parseInt(teclado.nextLine());


            if(opcao == 1){ //INSERIR LIVRO


                System.out.println("informe o nome do livro");
                String nome = teclado.nextLine();

                System.out.println("informe o preco do livro");
                double preco = Double.parseDouble(teclado.nextLine());

                System.out.println("informe a quantidade de exemplares");
                int quantidade = Integer.parseInt(teclado.nextLine());

                LivroService.livroInsert(nome,preco, quantidade);


            } else if (opcao == 2) { //UPDATE LIVRO
                System.out.println("informe o código do livro que deseja atualizar");
                int codigo = Integer.parseInt(teclado.nextLine());
                System.out.println("informe o novo preço");
                double preco = Double.parseDouble(teclado.nextLine());
                LivroService.livroUpdate(codigo, preco);

            }
            else if (opcao == 3) { //Remove LIVRO
                System.out.println("informe o codigo do livro que deseja remover");
                int codigo = Integer.parseInt(teclado.nextLine());
                LivroService.livroDelete(codigo);

            }

            else if (opcao == 4) { //Listar livros
                List<Livro> livroList = LivroService.listarTodos();
                System.out.println("\n");
                for (Livro l : livroList){
                    System.out.println(l);
                }
                System.out.println();
            }

            else if (opcao == 5) {// Adicionar vendedor
                System.out.println("Informe o nome do vendedor");
                String nome = teclado.nextLine();
                System.out.println("Informe o telefone do vendedor");
                String telefone  = teclado.nextLine();
                VendedorService.insert(nome, telefone);
            }

            else if (opcao == 6) { //  Editar vendedor

            }

            else if (opcao == 7) { // Deletar vendedor

            }

            else if (opcao == 8) { // Listar todos os vendedores

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
