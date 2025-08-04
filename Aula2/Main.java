package Aula2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Fruta f1 = new Fruta("Banana", "Nanica", 135, 15);
		
		f1.nome = "Banana";
		f1.tipo = "Nanica";
		f1.peso = 135;
		f1.tamanho = 15;
		
		System.out.println(f1);
		
		f1.nutrir();
		sc.close();
	}
}