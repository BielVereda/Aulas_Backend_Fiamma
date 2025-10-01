package Livros;

//Interface Emprestavel
//Conceito: Interface
public interface imprestavel {
 void emprestar(usuario u) throws livroIndisponivelException;
 void devolver();
}