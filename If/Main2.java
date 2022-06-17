import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int minutos = in.nextInt();
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
	}
}
