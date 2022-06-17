import java.util.Scanner;
public class exercício5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int codigo = in.nextInt();
		int quantidade = in.nextInt();
		
		double total;
		if(codigo == 1) {
			total = quantidade * 4.0;
		}else if(codigo == 2) {
			total = quantidade * 4.5;
		}else if(codigo == 3) {
			total = quantidade * 5.0;
		}else if(codigo == 4) {
			 total = quantidade * 2.0;
		}else {
			total = quantidade * 1.50;
		}
		System.out.printf("Total: R$ %.2f%n", total);
	}
}
