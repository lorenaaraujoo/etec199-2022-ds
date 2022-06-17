import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Produto produto = new Produto();
		
		System.out.print("Informe o nome do produto: ");
		produto.setNomeProduto(in.next());
		
		System.out.print("Informe o preço de custo: ");
		produto.setPrecoCusto(in.nextDouble());
		
		System.out.print("Informe o preço de venda: ");
		produto.setPrecoVenda(in.nextDouble());
		
		produto.calcularMargemLucro();
		System.out.println("\nMargem de lucro: R$"+produto.getMargemLucro());
		System.out.println("Percentual lucro:"+produto.getMargemLucroPorcentagem()+"%");
		
	}
}