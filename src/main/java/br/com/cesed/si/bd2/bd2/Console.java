package br.com.cesed.si.bd2.bd2;

import br.com.cesed.si.bd2.bd2.service.LivroService;
import br.com.cesed.si.bd2.bd2.service.VendaService;
import br.com.cesed.si.bd2.bd2.service.VendedorService;

import java.util.Scanner;


public class Console {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);


        while (true){
            System.out.println(
                            "\n 1 - inserir livro " +
                            " 2 - atualizar livro " +
                            " 3 - Deletar livro " +
                            "\n-----------------------------------------------------------------\n" +
                            " 4 - Inserir vendedor " +
                            " 5 - Atualizar vendedor " +
                            " 6 - Deletar vendedor " +
                            "\n-----------------------------------------------------------------\n" +
                            " 7 - Vender livro " +
                            "\n-----------------------------------------------------------------\n" +
                            " 8 - Listar livros " +
                            " 9 - Listar vendedores " +
                            " 10 - Listar vendas " +
                            " 999 - SAIR\n");

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

            } else if(opcao == 4) { //INSERIR vendedor


                System.out.println("informe o nome do vendedor");
                String nome = teclado.next();

                System.out.println("informe o telefone do vendedor");
                String telefone = teclado.next();

                VendedorService.vendedorInsert(nome, telefone);
            } else if(opcao == 5) { //atualizar vendedor


                System.out.println("informe a matricula do vendedor");
                int matricula = teclado.nextInt();

                System.out.println("informe o novo telefone do vendedor");
                String telefone = teclado.next();

                VendedorService.vendedorUpdate(matricula, telefone);
            }else if(opcao == 6) { //deletar vendedor


                System.out.println("informe a matricula do vendedor");
                int matricula = teclado.nextInt();

                VendedorService.vendedorDelete(matricula);
            }else if(opcao == 7) { //deletar vendedor


                System.out.println("informe a matricula do vendedo");
                int matricula = teclado.nextInt();

                System.out.println("informe o codigo do livro");
                int codigo = teclado.nextInt();

                System.out.println("informe a quantidade de exemplares");
                int quantidade = teclado.nextInt();

                VendaService.vendaInsert(matricula, codigo, 1);
            }
            else if(opcao == 8) { //listar livros

                LivroService.livroFindAll();

            }else if(opcao == 9) { //listar vendedores

               VendedorService.vendedorFindAll();
            }else if(opcao == 10) { //listar vendas

                VendaService.vendaFindAll();

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
