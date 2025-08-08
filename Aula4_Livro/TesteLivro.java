package Aula4_Livro;

public class TesteLivro {
    public static void main(String[] args) {
        System.out.println("=== Teste Livro ===");

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
        Livro livro2 = new Livro("História Curta", "Autor Desconhecido", 3);

        System.out.println("\nLivro 1:");
        livro1.exibirInfo();

        System.out.println("\nLivro 2:");
        livro2.exibirInfo();
    }
}