import java.util.Scanner;

public class Main {
	public static final Scanner in = new Scanner(System.in);
	
	public static Conta conta = new Conta();
	public static ContaCorrente contaCorrente = new ContaCorrente();
	
	public static void main(String[] args) {
		// CONTA 
		conta.saldoConta = 1000;
		
		System.out.print("DIGITE O TITULAR DA CONTA: ");
		conta.titularConta = in.next();
		System.out.print("DIGITE O NÚMERO DA CONTA: ");
		conta.numConta = in.nextInt();
		System.out.print("DIGITE O NÚMERO DA AGÊNCIA: ");
		conta.agenciaConta = in.nextInt();
		
		System.out.print("\n[S] - SACAR | [D] - DEPOSITAR: ");
		String opcao = in.next();
		
		if(opcao.equalsIgnoreCase("S")) {
			System.out.println("VALOR SAQUE: ");
			double valorSaque = in.nextDouble();
			conta.sacar(valorSaque);
		}else if(opcao.equalsIgnoreCase("D")) {
			System.out.println("VALOR DEPOSITO: ");
			double deposito = in.nextDouble();
			conta.depositar(deposito);
		}
		
		System.out.print("\nSALDO EM CONTA: "+conta.saldoConta);
		
		// CONTA CORRENTE
		System.out.println("\nDIGITE O TITULAR DA CONTA: ");
		contaCorrente.titularConta = in.next();
		System.out.println("DIGITE O NÚMERO DA AGÊNCIA: ");
		contaCorrente.agenciaConta = in.nextInt();
		
		contaCorrente.saldoConta = 1000;
		contaCorrente.creditoConta = 200;
		
		contaCorrente.taxarConta();
		contaCorrente.consultarConta();
	}

}
