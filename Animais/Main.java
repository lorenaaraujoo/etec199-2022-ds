package Animais;

public class Main {

	public static void main(String[] args) {
		Animal c = new Cachorro();
		Animal e = new Elefante();
		Animal j = new Jaguar();

		c.Características();
		System.out.println("---------------------------------------------------");
		e.Características();
		System.out.println("---------------------------------------------------");
		j.Características();
	}
}