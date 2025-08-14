package Aula4_Personagem;

public class PersonagemRPG {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;

    public PersonagemRPG(String nome, String classe, int nivel, int vida) {
        this.nome = nome;
        this.classe = classe;
        setNivel(nivel);
        setVida(vida);
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        if (nivel < 1) {
            System.out.println("Erro: O nível não pode ser menor que 1. Definindo como 1.");
            this.nivel = 1;
        } else {
            this.nivel = nivel;
        }
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else if (vida > 100) {
            this.vida = 100;
        } else {
            this.vida = vida;
        }
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
    }
}