package estoque;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.println("Name:");
		String name = in.nextLine();
		
		System.out.println("Price:");
		double price = in.nextDouble();
		Product product = new Product(name, price);
		
		System.out.println("Product data: "+product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = in.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock:");
		quantity = in.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+product);
		
		in.close();
	}
}
