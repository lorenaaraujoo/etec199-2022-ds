import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i <5; i++); {
			System.out.println("Digite um número");
			int numero = in.nextInt();
			if(numero %2 ==1) {
				System.out.println(numero + "é impar");
			} else {
				System.out.println(numero + "não é impar");
			}
		}	
	}
}