package app;

public class Lucros {
	private double soma;

	//Constructor
	public Lucros(double soma) {
		this.soma = soma;
	}
	
	//Get's and Set's
	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}
	
	//Method's
	public void registrar(Conta c) {
		this.soma += c.getSaldo();
		System.out.println("Valor R$"+c.getSaldo()+" adicionado ao lucro! Novo valor de lucro: R$"+this.soma);
	}
	
	
}
