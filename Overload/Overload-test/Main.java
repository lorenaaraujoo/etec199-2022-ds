
public class Main {
	public static void main(String[] args) {
		Number calc = new Number();
		
		int[] number = {1, 5, 3, 8, 9};
		System.out.println("-------------Testando se o número 2 é par:---------------");
		
		System.out.println(calc.par(2));
		
		System.out.println("------------Testando se o array de números é par:-------------");
		
		boolean[] pares = calc.par(number);
		
		for(int i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}
		
		System.out.println("---------Testando se o número 8 é primo:----------");
		
		boolean[] primos = calc.primo(number);
		
		for(int i = 0; i < primos.length; i++) {
			System.out.println(primos[i]);
		}
	}
}
