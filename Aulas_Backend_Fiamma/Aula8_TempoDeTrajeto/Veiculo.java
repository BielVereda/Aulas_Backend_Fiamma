public abstract class Veiculo {
    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public abstract double calcularTempo(double distancia);
}
