package Atividade2;
public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();
        Sistema sistema = new Sistema(livraria);
        sistema.main();
    }
}
