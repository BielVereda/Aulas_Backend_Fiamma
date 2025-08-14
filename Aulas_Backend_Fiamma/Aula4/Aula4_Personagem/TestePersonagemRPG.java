package Aula4_Personagem;

public class TestePersonagemRPG {
    public static void main(String[] args) {
        System.out.println("=== Teste Personagem RPG ===");

        PersonagemRPG p1 = new PersonagemRPG("Arthas", "Guerreiro", 5, 120);
        PersonagemRPG p2 = new PersonagemRPG("Merlin", "Mago", -3, -10); 

        System.out.println("\nPersonagem 1:");
        p1.exibirInfo();

        System.out.println("\nPersonagem 2:");
        p2.exibirInfo();
    }
}