package Livros;

//Classe Principal → ponto de entrada
public class principal {
 public static void main(String[] args) {
     try {
         biblioteca biblio = new biblioteca();

         // Criando usuários
         usuario aluno1 = new aluno(1, "João", "joao@email.com");
         usuario prof1 = new professor(2, "Maria", "maria@email.com");

         // Criando clientes
         cliente clienteAluno = new cliente(aluno1);
         cliente clienteProf = new cliente(prof1);

         // Adicionando livros
         biblio.adicionarLivro(new livro("L1", "Java Básico", "Autor A"));
         biblio.adicionarLivro(new livro("L2", "POO Avançada", "Autor B"));

         // Testes
         biblio.emprestarLivro(clienteAluno.getUsuario(), "L1"); // válido
         biblio.emprestarLivro(clienteProf.getUsuario(), "L2"); // válido

         // Tentativa de emprestar o mesmo livro
         biblio.emprestarLivro(clienteAluno.getUsuario(), "L2"); // deve falhar

     } catch (Exception e) {
         System.out.println("⚠️ Erro: " + e.getMessage());
     }
 }
}