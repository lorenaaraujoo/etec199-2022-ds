import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome do funcionário:");
		funcionario.setNome(in.next());
		
		System.out.println("Digite o CPF do funcionário:");
		funcionario.setCpf(in.next());
		
		System.out.println("Digite o valor do salário:");
		funcionario.setSalario(in.nextDouble());
		
		funcionario.imprimir();
		
	}

}
