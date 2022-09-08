package app;

public abstract class Conteudo {
	private String Genero;
	private String Titulo;
	
	public Conteudo(String Genero, String titulo) {
		this.Genero = Genero;
		this.Titulo = titulo;
	}

	public String getGenero() {
		return this.Genero;
	}

	public void setGenero(String Genero) {
		this.Genero = Genero;
	}

	public String getTitulo() {
		return this.Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}
	
	public void Descricao() {
		System.out.println("---------------------------");
		System.out.println("Categoria: "+this.Genero);
		System.out.println("Título: "+this.Titulo);
	}
	
}
