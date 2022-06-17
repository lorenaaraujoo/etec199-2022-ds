public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	
	//GET'S
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSalario(String moeda) {
		if(moeda.equals("US")) {
			return "US"+this.salario * 0.20;
		} else {
		return "R$"+salario;
		}
	}
	
	//SET'S 
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome, boolean caixaalta) {
		if (caixaalta) {
			this.nome = nome.toUpperCase();
		} else {
			nome = nome.toLowerCase();
		}
	}
		
	public void setNome(String nome, boolean caixaalta, String primeirapalavra) {
		if (caixaalta) {
			this.nome = nome.toUpperCase();
		} else {
			nome = nome.toLowerCase();
		}
		
		if(primeirapalavra=="S") {
			this.nome = nome.split(" ")[0];
		}
		
	}
	
	public void setNome(String nome, String primeirapalavra) {
		if (primeirapalavra == "S") {
			this.nome = nome.split(" ")[0];
		}
	}
	
	
	//Método
	
	public void imprimir() {
		System.out.println("-----RESULTADO-----");
		System.out.println("\nNome: "+this.getNome()+"\n");
		System.out.println("CPF: "+this.getCpf()+"\n");
		System.out.println("Salário BR: "+this.getSalario("R$"));
		System.out.println("\nSalário US: "+this.getSalario("US"));
		
	}
}
