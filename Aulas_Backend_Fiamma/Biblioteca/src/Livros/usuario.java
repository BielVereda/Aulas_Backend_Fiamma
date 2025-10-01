package Livros;

// Classe abstrata Usuario
// Conceitos: Abstração, Herança
public abstract class usuario {
    protected int id;
    protected String nome;
    protected String email;

    public usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    // Método abstrato → Força subclasses a implementar
    public abstract int getLimiteEmprestimos();

    @Override
    public String toString() {
        return id + " - " + nome + " (" + email + ")";
    }
}