package app;

public class Serie extends Conteudo {

	private int duracao;
	private int quantidadeEpisodios;
	private int quantidadeTemporadas;
	
	public Serie(String Genero, String titulo, int duracao, int quantidadeEpisodios, int quantidadeTemporadas) {
		super(Genero, titulo);
		this.duracao = duracao;
		this.quantidadeEpisodios = quantidadeEpisodios;
		this.quantidadeTemporadas = quantidadeTemporadas;
	}
	
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
	
	@Override
	public void Descricao() {
		System.out.println("------Série------");
		System.out.println("Título: "+super.getTitulo());
		System.out.println("Gênero: "+super.getGenero());
		System.out.println("Duração por episódio: "+this.duracao+" Minutos");
		System.out.println("Quantidade de episódios por temporada: "+this.quantidadeEpisodios);
		System.out.println("Quantidade de temporadas: "+this.quantidadeTemporadas);
		System.out.println("");
		}	
	
	
}
