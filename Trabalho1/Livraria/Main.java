package Trabalho1.Livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do livro: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do livro: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do livro: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o nome do autor: ");
                    String autor = scanner.nextLine();

                    produtos.add(new Livro(id, nome, preco, autor));
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nLISTA DE PRODUTOS:");
                    for (Produto produto : produtos) {
                        System.out.println("ID: " + produto.getId());
                        System.out.println("Nome: " + produto.getNome());
                        System.out.println("Preço: $" + produto.getPreco());
                        if (produto instanceof Livro) {
                            Livro livro = (Livro) produto;
                            System.out.println("Autor: " + livro.getAutor());
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}


