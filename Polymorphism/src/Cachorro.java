package Animais;

public class Cachorro extends Animal {

	@Override
	public void Correr() {
		System.out.println("Os cachorros atingem a velocidade de 30 km por hora.");
	}

	@Override
	public void Alimentar() {
		System.out.println("Os cachorros se alimentam de ração.");
	}

	@Override
	public void Dormir() {
		System.out.println("Os cachorros dormem de 12 a 14 horas por dia.");
	}

	@Override
	public void EmitirSom() {
		System.out.println("O som emitido pelos cachorros é: au-au-au!");
	}
}