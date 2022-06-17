import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Digite um número inteiro:");
		n = in.nextInt();
		//Estrutura de decisão simples
		if(n>20) {
			System.out.println("O número "+ n + "é maior que 20");
		}
		//Instrução fora da estrutura de decisão
		System.out.println("Fim do programa!");
		in.close();
	}

}
