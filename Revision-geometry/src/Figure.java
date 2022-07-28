
public class Figure {
	private double area;
	
	public Figure(double area) {
		super();
		this.area = area;
	}

	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	public void displayArea() {
		System.out.println("------Figure------");
		System.out.println("Área initial: "+this.area);
	}
	public void calcArea(double height, double width) {
		double result = 0;
		result = height * width;
		System.out.println("The area a of the given figure is: "+result);
		System.out.println();
	}
}
