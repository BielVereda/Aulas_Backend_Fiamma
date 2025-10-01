package Livros;

//Exceção personalizada para quando o usuário não existe
public class usuarioNaoEncontradoException extends Exception {
 public usuarioNaoEncontradoException(String msg) {
     super(msg);
 }
}