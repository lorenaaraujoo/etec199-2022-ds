package app;

public class ContaPoupan�a extends Conta {
	private double percentualRendimento = 0.01;
	
	//Constructor
	public ContaPoupan�a(String nome, String cpf, String numeroConta, double saldo) {
		super(nome, cpf, numeroConta, saldo);
	}
	
	//Method's
	public void atualizarSaldo() {
		double resultado = 0;
		resultado = (super.getSaldo() * percentualRendimento ) + super.getSaldo();
		super.setSaldo(resultado);
		System.out.println("Saldo em conta atualizado! Valor de saldo ganho R$"+(super.getSaldo() * percentualRendimento)+" novo saldo em conta: R$"+ resultado);
	}
	

}
