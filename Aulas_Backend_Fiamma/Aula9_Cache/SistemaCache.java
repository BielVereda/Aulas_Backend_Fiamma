import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCache {
    private List<Pessoa> banco;
    private Cache cache;

    public SistemaCache() {
        banco = new ArrayList<>();
        cache = new Cache(10); // máximo de 10 pessoas no cache
        popularBanco();
    }

    private void popularBanco() {
        banco.add(new Pessoa(1, "João", 25));
        banco.add(new Pessoa(2, "Maria", 30));
        banco.add(new Pessoa(3, "Carlos", 28));
        banco.add(new Pessoa(4, "Ana", 22));
        banco.add(new Pessoa(5, "Lucas", 35));
        banco.add(new Pessoa(6, "Mariana", 27));
        banco.add(new Pessoa(7, "Pedro", 40));
        banco.add(new Pessoa(8, "Juliana", 31));
        banco.add(new Pessoa(9, "Rafael", 29));
        banco.add(new Pessoa(10, "Fernanda", 26));
        banco.add(new Pessoa(11, "Gustavo", 33));
    }

    private Pessoa buscarNoBanco(int id) {
        for (Pessoa p : banco) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public void rodar() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o ID da pessoa (ou 0 para sair): ");
            int id = sc.nextInt();

            if (id == 0) {
                System.out.println("Saindo do sistema...");
                break;
            }

            Pessoa p = cache.buscar(id);

            if (p != null) {
                System.out.println("Pessoa encontrada no cache: " + p);
            } else {
                p = buscarNoBanco(id);
                if (p != null) {
                    System.out.println("Pessoa buscada no banco.");
                    cache.adicionar(p);
                } else {
                    System.out.println("Pessoa não encontrada no banco.");
                }
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        SistemaCache sistema = new SistemaCache();
        sistema.rodar();
    }
}
