package app;

public class Serie extends Conteudo {

	private int duracao;
	private int quantidadeEpisodios;
	private int quantidadeTemporadas;
	
	//Super Constructor
	public Serie(String Genero, String titulo, int duracao, int quantidadeEpisodios, int quantidadeTemporadas) {
		super(Genero, titulo);
		this.duracao = duracao;
		this.quantidadeEpisodios = quantidadeEpisodios;
		this.quantidadeTemporadas = quantidadeTemporadas;
	}
	
	//Get's and Set's
	public int getDuracao() {
		return this.duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getQuantidadeEpisodios() {
		return this.quantidadeEpisodios;
	}

	public void setQuantidadeEpisodios(int quantidadeEpisodios) {
		this.quantidadeEpisodios = quantidadeEpisodios;
	}

	public int getQuantidadeTemporadas() {
		return this.quantidadeTemporadas;
	}

	public void setQuantidadeTemporadas(int quantidadeTemporadas) {
		this.quantidadeTemporadas = quantidadeTemporadas;
	}
	
	//Method's
	@Override
	public void Descricao() {
		System.out.println("------S�rie------");
		System.out.println("T�tulo: "+super.getTitulo());
		System.out.println("G�nero: "+super.getGenero());
		System.out.println("Dura��o por epis�dio: "+this.duracao+" Minutos");
		System.out.println("Quantidade de epis�dios por temporada: "+this.quantidadeEpisodios);
		System.out.println("Quantidade de temporadas: "+this.quantidadeTemporadas);
		System.out.println("");
		}	
	
	
}
