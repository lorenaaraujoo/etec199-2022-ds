
public class TesteCarro {
	public static void main(String[] args) {
		Carro van = new Carro();
		
		Carro carro= new Carro("GM");
		Carro van2 = new Carro("Fiat", "Ducato");
		
		System.out.println(van.marca);
		System.out.println(carro.marca);
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		
	}
}
