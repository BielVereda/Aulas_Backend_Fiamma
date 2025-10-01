package Livros;

//Exceção personalizada para quando o livro não existe na biblioteca
public class livroNaoEncontradoException extends Exception {
 public livroNaoEncontradoException(String msg) {
     super(msg);
 }
}