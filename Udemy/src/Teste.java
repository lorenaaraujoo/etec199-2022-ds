import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int soma = 0;
		
		for(int i = 0; i <N; i+= 1) {
			int x = in.nextInt();
			soma += x;
		}
		
		in.close();
	}
}
