package Aula1;

public class Pessoa {
	
	public String nome;
	public int idade;
	public String genero;
	public double peso;
	public double altura;
	
	public Pessoa(String nome, int idade, String genero, double peso, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}

	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;	}
	
	public double calculoImc() {
		return peso/(altura*2);
	}
	
	@Override
	public String toString() {
		return "Pessoa: \n\nNome: " + nome + "\nIdade: " + idade + "\nGênero: " + genero + "\nPeso: " + peso;
	}

}