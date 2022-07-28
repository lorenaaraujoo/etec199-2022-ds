
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Figure figure1 = new Figure(2);
		
		figure1.displayArea();
		figure1.calcArea(10, 10);

		Square square1 = new Square(8);
		
		square1.displayArea();
		square1.calcArea(2, 2);
		
		Triangle triangle1 = new Triangle(16);
		triangle1.displayArea();
		triangle1.calcArea(10, 12);
		
		Losango losango1 = new Losango(32);
		losango1.displayArea();
		losango1.calcArea(20, 24);
		
		Rectangle rectangle1 = new Rectangle(64);
		rectangle1.displayArea();
		rectangle1.calcArea(40, 10);
	}

}
