public class Main1 {
	public static void main(String[] args) {
		// PRIMEIRO ANIMAL
		Animal primeiroAnimal = new Animal();
		primeiroAnimal.setEspecie("Ave");
		primeiroAnimal.setNome("Pato");
		primeiroAnimal.setQuantPatas(2);
		primeiroAnimal.setPeso(10);
		
		System.out.println("\nEspécie: "+primeiroAnimal.getEspecie()+"\nNome: "+primeiroAnimal.getNome()+"\nqtd_patas: "+primeiroAnimal.getQuantPatas()+"\nPeso: "+primeiroAnimal.getPeso());
		
		// SEGUNDO ANIMAL
		Animal segundoAnimal = new Animal("Poodle", "Cachorro", 4, 25);
		System.out.println("\nEspécie: "+segundoAnimal.getEspecie()+"\nNome: "+segundoAnimal.getNome()+"\nqtd_patas: "+segundoAnimal.getQuantPatas()+"\nPeso: "+segundoAnimal.getPeso());
		
		// TERCEIRO ANIMAL
		Animal terceiroAnimal = new Animal("Animal", "Gato", 4, 32);
		System.out.println("\nEspécie: "+terceiroAnimal.getEspecie()+"\nNome: "+terceiroAnimal.getNome()+"\nqtd_patas: "+terceiroAnimal.getQuantPatas()+"\nPeso: "+terceiroAnimal.getPeso());
	}
}
