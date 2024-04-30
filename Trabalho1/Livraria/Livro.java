package Trabalho1.Livraria;

public class Livro extends Produto {
    private String autor;

    public Livro(int id, String nome, double preco, String autor) {
        super(id, nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String novoAutor) {
        this.autor = novoAutor;
    }
}

