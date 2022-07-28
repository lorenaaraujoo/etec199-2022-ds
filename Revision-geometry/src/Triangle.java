public class Triangle extends Figure {

	public Triangle(double area) {
		super(area);
	}
	
	@Override
	public void displayArea() {
		System.out.println("------Triangle------");
		System.out.println("Área initial: "+getArea());
	}
	
	@Override
	public void calcArea(double base, double height) {
		double result = 0;
		result = (base * height) / 2;
		System.out.println("The area of ​​the given triangle is "+result);
		System.out.println();
	}
	
	
}
