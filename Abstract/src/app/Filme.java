package app;

public class Filme extends Conteudo {
	private int duracao;
	
	//Super Constructor
	public Filme(String Genero, String titulo, int duracao) {
		super(Genero, titulo);
		this.duracao = duracao;
	}

	//Get's and Set's
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	//Method's
	@Override
	public void Descricao() {
		System.out.println("------Filme------");
		System.out.println("T�tulo: "+super.getTitulo());
		System.out.println("G�nero: "+super.getGenero());
		System.out.println("Dura��o: "+this.duracao+" Minutos");
		System.out.println("");
		}
	
	}	
	
