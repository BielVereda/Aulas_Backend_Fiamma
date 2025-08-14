package Aula1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa("Danilo", 19);
		
		p1.peso = 90;
		p1.genero = "Masculino";
		p1.altura = 1.75;
		
		System.out.println(p1);
		
		System.out.println("\nO IMC é: "+ p1.calculoImc());		
	}
}