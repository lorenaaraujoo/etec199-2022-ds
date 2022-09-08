package app;

public abstract class Conteudo {
	private String Genero;
	private String Titulo;
	
	//Constructor 
	public Conteudo(String Genero, String titulo) {
		this.Genero = Genero;
		this.Titulo = titulo;
	}

	//Get's and Set's
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
	
	//Method's
	public void Descricao() {
		System.out.println("---------------------------");
		System.out.println("Categoria: "+this.Genero);
		System.out.println("T�tulo: "+this.Titulo);
	}
	
}
