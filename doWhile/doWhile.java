import java.util.Scanner;
import java.util.Locale;

public class doWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.println("Digite a temperatura Celsius:");
			double C = in.nextDouble();
			double F = 9.0 * C / 5.0 + 32.00;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n ", F);
			System.out.print("Deseja repetir (s/n)?");
			resp = in.next().charAt(0);
		} while (resp != 'n');
		
		in.close();
	}
}
