package app;

public class Conta {
	private String Nome;
	private String Cpf;
	private String numeroConta;
	private double saldo;
	
	//Constructor
	public Conta(String nome, String cpf, String numeroConta, double saldo) {
		this.Nome = nome;
		this.Cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	//Get's and Set's
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Method's
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Valor R$"+valor+ " depositado com sucesso! Saldo em conta: R$"+this.saldo);
	}
	
	public void sacar(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saque de R$"+valor+ ". Saldo insuficiente pois o saldo em conta é: R$"+this.saldo);
		} else {
			this.saldo -= valor;
			System.out.println("Valor R$"+valor+" sacado com sucesso! Saldo em conta: R$"+this.saldo);
		}
	}
	public void imprimirSaldo() {	
		System.out.println("-----------");
		System.out.println("Conta: "+this.numeroConta);
		System.out.println("Titular: "+this.Nome);
		System.out.println("Saldo: R$"+this.saldo);
		System.out.println("-----------");
	}
}

