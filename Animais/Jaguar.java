package Animais;

public class Jaguar extends Animal {

	@Override
	public void Correr() {
		System.out.println("Os jaguares atingem a velocidade de 70 km por hora.");
	}

	@Override
	public void Alimentar() {
		System.out.println("Os jaguares se alimentam de carne de outros animais.");
	}

	@Override
	public void Dormir() {
		System.out.println("Os jaguares dormem 8 horas por dia.");
	}

	@Override
	public void EmitirSom() {
		System.out.println("O som emitido pelos jaguares é: GRRRRRRRRRRRA!");
	}
}