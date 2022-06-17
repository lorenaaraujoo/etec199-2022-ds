import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número inteiro:");
		num = in.nextInt();
		
		//Divide o número por 2 - usando o mod % 
		if(num%2==0) {
			System.out.println("O número "+ num + " é par!");
		}else {
			System.out.println("O número "+ num + " é impar!");
		}
	}

}
