package Livros;

//Subclasse Professor
//Conceito: Herança e Sobrescrita
public class professor extends usuario {
 public professor(int id, String nome, String email) {
     super(id, nome, email);
 }

 @Override
 public int getLimiteEmprestimos() {
     return 5;
 }
}