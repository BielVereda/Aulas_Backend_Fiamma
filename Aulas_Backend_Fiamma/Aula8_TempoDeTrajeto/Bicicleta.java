public class Bicicleta extends Veiculo {
    private static final double VELOCIDADE_MEDIA = 20.0;

    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE_MEDIA;
    }
}
