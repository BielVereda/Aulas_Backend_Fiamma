package Aula2;

public class Fruta {
	
	public String nome;
	public String tipo;
	public double peso;
	public double tamanho;

	public Fruta(String nome, String tipo, double peso, double tamanho) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.peso = peso;
		this.tamanho = tamanho;
	}
	
	public void nutrir() {
		System.out.print("Essa fruta nutre bem!");
	}
	
	@Override
	public String toString() {
		return "Fruta: \n\nNome: " + nome + "\nTipo: " + tipo + "\nTamanho: " + tamanho + "cm\nPeso: " + peso + "g\n\nNutrição:";
	}
}