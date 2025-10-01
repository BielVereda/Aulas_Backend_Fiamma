package Livros;

//Classe Cliente → simula alguém que usa a biblioteca
public class cliente {
 private usuario usuario;

 public cliente(usuario usuario) {
     this.usuario = usuario;
 }

 public usuario getUsuario() { return usuario; }
}
