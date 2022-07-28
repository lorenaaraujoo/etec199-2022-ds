

public class Square extends Figure {

	public Square(double area) {
		super(area);
	}

	@Override
	public void displayArea() {
		System.out.println("------Square------");
		System.out.println("Área initial: "+getArea());
	}
	
	@Override
	public void calcArea(double length, double width) {
		double result= 0;
		result = length * width;
		System.out.println("The area of ​​the given square is "+result);
		System.out.println();
	}
}
