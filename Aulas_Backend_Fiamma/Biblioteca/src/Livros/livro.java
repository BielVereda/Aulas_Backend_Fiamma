package Livros;

//Classe Livro
//Conceitos: Encapsulamento, Interface, Sobrescrita
public class livro implements imprestavel {
 private String codigo;
 private String titulo;
 private String autor;
 private String status; // "DISPONIVEL" ou "EMPRESTADO"

 public livro(String codigo, String titulo, String autor) {
     this.codigo = codigo;
     this.titulo = titulo;
     this.autor = autor;
     this.status = "DISPONIVEL";
 }

 // Getters e setters → Encapsulamento
 public String getCodigo() { return codigo; }
 public String getTitulo() { return titulo; }
 public String getAutor() { return autor; }
 public String getStatus() { return status; }

 public void setStatus(String status) { this.status = status; }

 // Métodos da interface
 @Override
 public void emprestar(usuario u) throws livroIndisponivelException {
     if (status.equals("EMPRESTADO")) {
         throw new livroIndisponivelException("Livro já emprestado!");
     }
     this.status = "EMPRESTADO";
 }

 @Override
 public void devolver() {
     this.status = "DISPONIVEL";
 }

 @Override
 public String toString() {
     return "[" + codigo + "] " + titulo + " - " + autor + " (" + status + ")";
 }
}
