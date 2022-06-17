import java.util.Scanner;
public class parImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um número:");
		numero = in.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("Número par!");
		}else {
			System.out.println("Número impar!");
		}
	}
}
