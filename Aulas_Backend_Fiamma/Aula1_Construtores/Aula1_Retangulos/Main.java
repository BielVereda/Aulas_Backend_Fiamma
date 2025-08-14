package Aula1_Retangulos;

import java.util.Scanner; 

public class Main {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Elementos elemento = new Elementos();
		
		System.out.print("Digite o valor da altura do 1° retângulo: ");
		elemento.altura = sc.nextDouble();
		System.out.print("Digite o valor do base do 1° retângulo: ");
		elemento.lado = sc.nextDouble();
		
		System.out.print("\nDigite o valor da altura do 2° retângulo: ");
		elemento.altura2 = sc.nextDouble();
		System.out.print("Digite o valor do base do 2° retângulo: ");
		elemento.lado2 = sc.nextDouble();
		
		System.out.print("\nDigite o valor da altura do 3° retângulo: ");
		elemento.altura3 = sc.nextDouble();
		System.out.print("Digite o valor do base do 3° retângulo: ");
		elemento.lado3 = sc.nextDouble();
				
		System.out.println("\n---------------------------------------------------------------------");
		System.out.println("\nAltura (1° retângulo): " + elemento.altura + "m");
		System.out.println("Base (1° retângulo): " + elemento.lado + "m");
		System.out.println("Área do 1° retângulo: " + elemento.calculoArea() + "m");
		
		System.out.println("\nAltura (2° retângulo): " + elemento.altura2 + "m");
		System.out.println("Base (2° retângulo): " + elemento.lado2 + "m");
		System.out.println("Área do 2° retângulo: " + elemento.calculoArea2() + "m");
		
		System.out.println("\nAltura (3° retângulo): " + elemento.altura3 + "m");
		System.out.println("Base (3° retângulo): " + elemento.lado3 + "m");
		System.out.println("Área do 3° retângulo: " + elemento.calculoArea3() + "m");
	}
}