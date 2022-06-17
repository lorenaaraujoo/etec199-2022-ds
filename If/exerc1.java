import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double S;
		
		System.out.println("Digite seu salário");
		S = in.nextDouble();	
		if(S < 957.00) {
			System.out.println("Seu salário é abaixo de R$ 957.00");
		}else {
			System.out.println("Seu salário é acima de R$ 957.00");
		}
	}

}
