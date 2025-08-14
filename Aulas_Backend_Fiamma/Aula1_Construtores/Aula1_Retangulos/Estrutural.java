package Aula1_Retangulos;

import java.util.Scanner;

public class Estrutural {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double lado, altura, lado2, altura2, lado3, altura3;
		
		System.out.print("Digite o valor da altura do 1° retângulo: ");
		altura = sc.nextDouble();
		System.out.print("Digite o valor do base do 1° retângulo: ");
		lado = sc.nextDouble();
		
		System.out.print("\nDigite o valor da altura do 2° retângulo: ");
		altura2 = sc.nextDouble();
		System.out.print("Digite o valor do base do 2° retângulo: ");
		lado2 = sc.nextDouble();
		
		System.out.print("\nDigite o valor da altura do 3° retângulo: ");
		altura3 = sc.nextDouble();
		System.out.print("Digite o valor do base do 3° retângulo: ");
		lado3 = sc.nextDouble();
				
		System.out.println("\n---------------------------------------------------------------------");
		System.out.println("\nAltura (1° retângulo): " + altura + "m");
		System.out.println("Base (1° retângulo): " + lado + "m");
		System.out.println("Área do 1° retângulo: " + lado*altura + "m");
		
		System.out.println("\nAltura (2° retângulo): " + altura2 + "m");
		System.out.println("Base (2° retângulo): " + lado2 + "m");
		System.out.println("Área do 2° retângulo: " + altura2*lado2 + "m");
		
		System.out.println("\nAltura (3° retângulo): " + altura + "m");
		System.out.println("Base (3° retângulo): " + lado + "m");
		System.out.println("Área do 3° retângulo: " + lado3*altura3 + "m");
	}
}