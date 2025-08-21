public class Onibus extends Veiculo {
    private static final double VELOCIDADE_MEDIA = 60.0;
    private int numeroParadas;

    public Onibus(String modelo, int numeroParadas) {
        super(modelo);
        this.numeroParadas = numeroParadas;
    }

    @Override
    public double calcularTempo(double distancia) {
        return (distancia / VELOCIDADE_MEDIA) + (numeroParadas * 0.25);
    }
}
