public class Carro extends Veiculo {
    private static final double VELOCIDADE_MEDIA = 80.0;

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE_MEDIA;
    }
}
