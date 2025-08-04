package Aula2_Encapsulation;

public class Musica {
	private String titulo;
	private String artista;
	private String genero;
	private String anoDeLancamento;
	
	public void tocar() {
		System.out.println("\nA música é '" + titulo + "', foi criada por " + artista);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(String anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	@Override
	public String toString() {
		return "Música:\n\nTítulo: " + titulo + "\nArtista: " + artista + "\nGênero: " + genero + "\nAno de lancamento: " + anoDeLancamento;
	}
}