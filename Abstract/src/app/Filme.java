package app;

public class Filme extends Conteudo {
	private int duracao;
	
	public Filme(String Genero, String titulo, int duracao) {
		super(Genero, titulo);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public void Descricao() {
		System.out.println("------Filme------");
		System.out.println("Título: "+super.getTitulo());
		System.out.println("Gênero: "+super.getGenero());
		System.out.println("Duração: "+this.duracao+" min");
		System.out.println("");
		}
	
	}	
	
