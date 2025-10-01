package Livros;

//Subclasse Aluno
//Conceito: Herança e Sobrescrita
public class aluno extends usuario {
 public aluno(int id, String nome, String email) {
     super(id, nome, email);
 }

 @Override
 public int getLimiteEmprestimos() {
     return 2;
 }
}