import java.util.Scanner;
public class menorMaior {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um número:");
		numero = in.nextInt();
		
		if(numero < 1) {
			System.out.println("Número negativo");
		}else if (numero == 0){
			System.out.println("Número neutro!");
		}else {
			System.out.println("Número positivo!");
		}
	}
}
