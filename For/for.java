import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 0;i <5; i++) {
		System.out.println("Digite um número:");
		int numero = in.nextInt();
		int resultado = numero *3;
		System.out.println(numero + "* 3 = " + resultado);
		}
	}

}
