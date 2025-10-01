package Livros;

import java.util.*;

//Classe Biblioteca
//Conceitos: Coleções, Polimorfismo, Sobrecarga
public class biblioteca {
 private List<livro> livros;
 private Map<usuario, List<emprestimo>> emprestimos;

 public biblioteca() {
     livros = new ArrayList<>();
     emprestimos = new HashMap<>();
 }

 public void adicionarLivro(livro l) {
     livros.add(l);
 }

 // Emprestar livro (usuário como objeto)
 public void emprestarLivro(usuario u, String codigo) throws Exception {
     livro l = buscarLivro(codigo);
     if (l.getStatus().equals("EMPRESTADO")) {
         throw new livroIndisponivelException("Livro indisponível!");
     }
     List<emprestimo> lista = emprestimos.getOrDefault(u, new ArrayList<>());
     if (lista.size() >= u.getLimiteEmprestimos()) {
         throw new limiteEmprestimosAtingidoException("Usuário atingiu o limite!");
     }
     l.emprestar(u);
     emprestimo e = new emprestimo(l, u);
     lista.add(e);
     emprestimos.put(u, lista);
     System.out.println("✅ " + u.getNome() + " emprestou: " + l.getTitulo());
 }

 // Sobrecarga → emprestar usando ID
 public void emprestarLivro(int userId, String codigo) throws Exception {
     usuario u = buscarUsuario(userId);
     emprestarLivro(u, codigo);
 }

 public void devolverLivro(usuario u, String codigo) throws Exception {
     livro l = buscarLivro(codigo);
     l.devolver();
     List<emprestimo> lista = emprestimos.get(u);
     if (lista != null) {
         lista.removeIf(e -> e.getLivro().getCodigo().equals(codigo));
     }
     System.out.println("🔄 " + u.getNome() + " devolveu: " + l.getTitulo());
 }

 private livro buscarLivro(String codigo) throws livroNaoEncontradoException {
     return livros.stream()
             .filter(l -> l.getCodigo().equals(codigo))
             .findFirst()
             .orElseThrow(() -> new livroNaoEncontradoException("Livro não encontrado!"));
 }

 private usuario buscarUsuario(int id) throws usuarioNaoEncontradoException {
     return emprestimos.keySet().stream()
             .filter(u -> u.getId() == id)
             .findFirst()
             .orElseThrow(() -> new usuarioNaoEncontradoException("Usuário não encontrado!"));
 }
}