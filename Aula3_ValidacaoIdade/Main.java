package Aula3_ValidacaoIdade;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 25);
        System.out.println(p.getNome() + " tem " + p.getIdade() + " anos.");

        p.setIdade(-5);
        System.out.println(p.getNome() + " agora tem " + p.getIdade() + " anos.");
    }
}