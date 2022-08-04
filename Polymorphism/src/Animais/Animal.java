package Animais;

public class Animal {
	String cor;
	String nome;
	double tamanho;

	// Método Construtor
	public Animal(String cor, String nome, double tamanho) {
		this.cor = cor;
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public Animal() {
	}

	// Getter's | Setter's
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public void Correr() {
	}

	public void Alimentar() {
	}

	public void Dormir() {
	}

	public void EmitirSom() {
	}

	public void Características() {
		this.Correr();
		this.Alimentar();
		this.EmitirSom();
	}
}