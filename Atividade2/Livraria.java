package Atividade2;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Lista de livros:");
            for (Livro livro : livros) {
                System.out.println(livro.getId() + " - " + livro.getTitulo());
            }
        }
    }

    public void detalharLivro(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                System.out.println("Detalhes do livro:");
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Ano de publicação: " + livro.getAno());
                System.out.println("Editora: " + livro.getEditora());
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
}
