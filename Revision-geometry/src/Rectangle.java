

public class Rectangle extends Figure {

	public Rectangle(double area) {
		super(area);
	}
	
	@Override
	public void displayArea() {
		System.out.println("------Rectangle------");
		System.out.println("Área initial: "+getArea());
	}
	
	@Override
	public void calcArea(double length, double width) {
		double result = 0;
		result = length * width;
		System.out.println("The area of ​​the given rectangle is: "+result);
		System.out.println();
	}

}
