package Trabalho1.Livraria;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}

