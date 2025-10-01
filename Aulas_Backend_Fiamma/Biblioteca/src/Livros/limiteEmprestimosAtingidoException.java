package Livros;

//Exceção personalizada para quando o usuário atingiu o limite de empréstimos
public class limiteEmprestimosAtingidoException extends Exception {
 public limiteEmprestimosAtingidoException(String msg) {
     super(msg);
 }
}