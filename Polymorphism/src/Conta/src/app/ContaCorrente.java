package app;

public class ContaCorrente extends Conta {
	private double tarifaMensal = 10;
	
	public ContaCorrente(String nome, String cpf, String numeroConta, double saldo) {
		super(nome, cpf, numeroConta, saldo);
	}

	public double getTarifaMensal() {
		return tarifaMensal;
	}

	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}
	
	

}
