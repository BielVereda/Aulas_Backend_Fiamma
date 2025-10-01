package Livros;

//Exceção personalizada para quando o livro já está emprestado
public class livroIndisponivelException extends Exception {
 public livroIndisponivelException(String msg) {
     super(msg);
 }
}