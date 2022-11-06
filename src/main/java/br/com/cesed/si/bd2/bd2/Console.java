package br.com.cesed.si.bd2.bd2;

import br.com.cesed.si.bd2.bd2.entidades.Livro;
import br.com.cesed.si.bd2.bd2.service.LivroService;
<<<<<<< HEAD
import br.com.cesed.si.bd2.bd2.service.VendaService;
=======
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221
import br.com.cesed.si.bd2.bd2.service.VendedorService;

import java.util.List;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);


        while (true){
<<<<<<< HEAD
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
=======
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
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221

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
<<<<<<< HEAD
            else if(opcao == 8) { //listar livros

                LivroService.livroFindAll();

            }else if(opcao == 9) { //listar vendedores

               VendedorService.vendedorFindAll();
            }else if(opcao == 10) { //listar vendas

                VendaService.vendaFindAll();
=======

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
>>>>>>> 04530a1eb1aad161decf04fed7b5081c203cf221

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
