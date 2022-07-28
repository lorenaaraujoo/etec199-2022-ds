public class Losango extends Figure {

	public Losango(double area) {
		super(area);
	}
	
	@Override
	public void displayArea() {
		System.out.println("------Losango------");
		System.out.println("Área initial: "+getArea());
	}
	
	@Override
	public void calcArea(double diagonalLarger, double diagonalSmaller) {
		double result = 0;
		result = (diagonalLarger * diagonalSmaller) / 2;
		System.out.println("The area a of the given losango is: "+result);
		System.out.println();
	}
	
}
