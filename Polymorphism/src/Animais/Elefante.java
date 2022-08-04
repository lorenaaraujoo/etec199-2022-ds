package Animais;

public class Elefante extends Animal {

	@Override
	public void Correr() {
		System.out.println("Os elefantes atingem a velocidade de 5 km por hora.");
	}

	@Override
	public void Alimentar() {
		System.out.println("Os elefantes se alimentam de frutas e folhas.");
	}

	@Override
	public void Dormir() {
		System.out.println("Os elefantes dormem 2 horas por dia.");
	}

	@Override
	public void EmitirSom() {
		System.out.println("O som emitido pelos elefantes é: PRUUUUUUUUUU!");
	}
}