package Livros;

import java.time.LocalDate;

//Classe Emprestimo
//Conceitos: Associação entre classes
public class emprestimo {
 private livro livro;
 private usuario usuario;
 private LocalDate dataEmprestimo;
 private LocalDate dataDevolucaoPrevista;

 public emprestimo(livro livro, usuario usuario) {
     this.livro = livro;
     this.usuario = usuario;
     this.dataEmprestimo = LocalDate.now();
     this.dataDevolucaoPrevista = dataEmprestimo.plusDays(7);
 }

 public livro getLivro() { return livro; }
 public usuario getUsuario() { return usuario; }
 public LocalDate getDataEmprestimo() { return dataEmprestimo; }
 public LocalDate getDataDevolucaoPrevista() { return dataDevolucaoPrevista; }

 @Override
 public String toString() {
     return "Empréstimo: " + livro.getTitulo() + " para " + usuario.getNome() +
            " em " + dataEmprestimo + ", devolver até " + dataDevolucaoPrevista;
 }
}