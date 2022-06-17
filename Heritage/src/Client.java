public class Client {
	
	private String Name;
	private int Age;
	private String Address;
	private double Order_value;
	private double Discount;

	// GET | SET
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) {
		Age = age;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	
	public double getOrder_value() {
		return Order_value;
	}
	
	public void setOrder_value(double order_value) {
		Order_value = order_value;
	}
	
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	
	//MÉTODO
	
	public double calculateDiscount() {
		return (this.Order_value - (this.Order_value * 0.10));
	}
}