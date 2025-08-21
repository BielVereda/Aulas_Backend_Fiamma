import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double distancia = 100.0;

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Carro Popular"));
        veiculos.add(new Bicicleta("Bike Esportiva"));
        veiculos.add(new Onibus("Ônibus Urbano", 3));

        for (Veiculo v : veiculos) {
            double tempo = v.calcularTempo(distancia);
            System.out.printf("%s levará %.2f horas para percorrer %.0f km.%n", v.modelo, tempo, distancia);
        }
    }
}
