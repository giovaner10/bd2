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
                            " 2 - Atualizar livro " +
                            " 3 - Deletar livro " +
                            "\n-----------------------------------------------------------------\n" +
                            " 4 - Inserir vendedor " +
                            " 5 - Atualizar vendedor " +
                            " 6 - Deletar vendedor " +
                            "\n-----------------------------------------------------------------\n" +
                            " 7 - Vender livro " +
                            " 8 - Atualizar venda " +
                            " 9 - Deletar venda " +
                            "\n-----------------------------------------------------------------\n" +
                            " 10 - Listar livros " +
                            " 11 - Listar vendedores " +
                            " 12 - Listar vendas " +
                            " 999 - SAIR\n");


            int opcao = teclado.nextInt();


            if(opcao == 1){ //INSERIR LIVRO


                System.out.println("informe o nome do livro");
                String nome = teclado.next();

                System.out.println("informe o preco do livro");
                double preco = teclado.nextDouble();

                System.out.println("informe a quantidade de exemplares");
                int quantidade = teclado.nextInt();

                LivroService.livroInsert(nome, preco, quantidade);
                lerVerificar(teclado);




            } else if (opcao == 2) { //UPDATE LIVRO
                System.out.println("informe o código do livro que deseja atualizar");
                int codigo = teclado.nextInt();

                System.out.println("informe o novo preço");
                double preco = teclado.nextDouble();

                LivroService.livroUpdate(codigo, preco);
                lerVerificar(teclado);


            } else if (opcao == 3) { //Remove LIVRO
                System.out.println("informe o codigo do livro que deseja remover");
                int codigo = teclado.nextInt();

                LivroService.livroDelete(codigo);
                lerVerificar(teclado);


            } else if(opcao == 4) { //INSERIR vendedor


                System.out.println("informe o nome do vendedor");
                String nome = teclado.next();

                System.out.println("informe o telefone do vendedor");
                String telefone = teclado.next();

                VendedorService.vendedorInsert(nome, telefone);
                lerVerificar(teclado);

            } else if(opcao == 5) { //atualizar vendedor


                System.out.println("informe a matricula do vendedor");
                int matricula = teclado.nextInt();

                System.out.println("informe o novo telefone do vendedor");
                String telefone = teclado.next();

                VendedorService.vendedorUpdate(matricula, telefone);
                lerVerificar(teclado);

            }else if(opcao == 6) { //deletar vendedor


                System.out.println("informe a matricula do vendedor");
                int matricula = teclado.nextInt();

                VendedorService.vendedorDelete(matricula);
                lerVerificar(teclado);

            }else if(opcao == 7) { //deletar vendedor


                System.out.println("informe a matricula do vendedor");
                int matricula = teclado.nextInt();

                System.out.println("informe o codigo do livro");
                int codigo = teclado.nextInt();

                System.out.println("informe a quantidade de exemplares");
                int quantidade = teclado.nextInt();

                VendaService.vendaInsert(matricula, codigo, quantidade);
                lerVerificar(teclado);

            } else if (opcao == 8) { //atualizar vendA


                System.out.println("informe o codigo da venda");
                int codigo = teclado.nextInt();

                System.out.println("informe o novo total de livros da venda");
                int quantidade = teclado.nextInt();

                VendaService.vendaUpdate(codigo, quantidade);
                lerVerificar(teclado);

            } else if(opcao == 9) { //deletar venda


                System.out.println("informe o codigo da venda");
                int codigo = teclado.nextInt();

                VendaService.vendaDelete(codigo);
                lerVerificar(teclado);

            }

            else if (opcao == 10) { //listar livros

                LivroService.livroFindAll();
                lerVerificar(teclado);

            } else if (opcao == 11) { //listar vendedores

                VendedorService.vendedorFindAll();
                lerVerificar(teclado);

            } else if (opcao == 12) { //listar vendas

                VendaService.vendaFindAll();
                lerVerificar(teclado);

            } else if (opcao == 999) { //SAIR DO SISTEMA
                System.out.println("Processando...");
                Thread.sleep(1300);
                System.out.println("App fechado!");
                break;
            }
        }
    }


    public static void lerVerificar(Scanner teclado) {
        while (true) {
            System.out.println("pressione qualquer tecla para continuar");
            teclado.next();
            break;
        }
    }
}


