import java.util.Scanner;
public class multiplos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite um número");
		a = in.nextInt();
		
		System.out.println("Digite um número");
		b = in.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("São multiplos!");
		}else {
			System.out.println("Não são multiplos!");
		}
	}
}
