import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n;
	
		System.out.println("Digite um número inteiro:");
		n = in.nextInt();
		
		//Estrutura de decisão encadeada
		if(n>0) {
			System.out.println("O número "+ n + " é positivo!");
		}else {
			if(n<0) {
				System.out.println("O número "+ n + " é negativo!");
			}else {
				System.out.println("O número "+ n + "é neutro!");
			}
		}
	}

}
