package Atividade2;

import java.util.Scanner;

public class Sistema {
    private Livraria livraria;

    public Sistema(Livraria livraria) {
        this.livraria = livraria;
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarLivro(scanner);
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    detalharLivro(scanner);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private void cadastrarLivro(Scanner scanner) {
        scanner.nextLine(); // Consumir a quebra de linha após o próximoInt()
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Digite o ano de publicação do livro:");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximoInt()
        System.out.println("Digite a editora do livro:");
        String editora = scanner.nextLine();

        Livro novoLivro = new Livro(titulo, autor, ano, editora);
        livraria.cadastrarLivro(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    private void listarLivros() {
        livraria.listarLivros();
    }

    private void detalharLivro(Scanner scanner) {
        System.out.println("Digite o ID do livro:");
        int id = scanner.nextInt();
        livraria.detalharLivro(id);
    }
}

