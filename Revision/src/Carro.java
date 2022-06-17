public class Carro {
	String marca;
	String modelo;
	int anoModelo;
	int numPassageiros;
	double capacidadeTanque;
	double consumoCombustivel;
	
	Carro(){}
	
	Carro(String marca){
		this.marca = marca;
	}

	Carro(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
		
		if(modelo.equalsIgnoreCase("Ducato")) {
			this.numPassageiros = 19;
		};
	}
}

