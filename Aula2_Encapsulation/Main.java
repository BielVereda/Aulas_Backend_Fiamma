package Aula2_Encapsulation;

public class Main {
	public static void main(String[] args) {
		
		Musica music = new Musica();
		
		music.setArtista("Bruno Mars");
		music.setGenero("POP");
		music.setAnoDeLancamento("2023");
		music.setTitulo("24k Magic");
		
		System.out.println(music);
		music.tocar();
	}
}