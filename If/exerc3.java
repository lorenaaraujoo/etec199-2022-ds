import java.util.Scanner;

public class exerc3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número inteiro");
		num = in.nextInt();
		
		//Estrutura de decisão composta
		if(num>0) {
			System.out.println("O número "+ num + "  positivo!");
		}else {
			System.out.println("O número "+ num + " é negativo!");
		}
	}

}
