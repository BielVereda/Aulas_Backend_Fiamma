import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> banco = new ArrayList<>();
        List<Pessoa> cache = new ArrayList<>();

        banco.add(new Pessoa(1, "Alice", 25));
        banco.add(new Pessoa(2, "Bruno", 30));
        banco.add(new Pessoa(3, "Carla", 22));
        banco.add(new Pessoa(4, "Diego", 28));
        banco.add(new Pessoa(5, "Eva", 35));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o ID da pessoa (ou 0 para sair): ");
            int id = scanner.nextInt();

            if (id == 0) break;

            Pessoa encontrada = null;

            for (Pessoa p : cache) {
                if (p.getId() == id) {
                    encontrada = p;
                    break;
                }
            }

            if (encontrada != null) {
                System.out.println("Pessoa encontrada no cache: " + encontrada);
            } else {
                for (Pessoa p : banco) {
                    if (p.getId() == id) {
                        encontrada = p;
                        break;
                    }
                }

                if (encontrada != null) {
                    if (cache.size() >= 10) {
                        cache.remove(0);
                    }

                    cache.add(encontrada);
                    System.out.println("Pessoa buscada no banco e adicionada ao cache: " + encontrada);
                } else {
                    System.out.println("Pessoa não encontrada no banco.");
                }
            }
        }

        scanner.close();
    }
}
