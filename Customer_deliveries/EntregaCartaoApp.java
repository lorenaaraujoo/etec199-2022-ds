package poo.model;
import poo.Endereco;
import poo.Cliente;

public class EntregaCartaoApp {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.cep = "0000000";
		
		Cliente cliente = new Cliente();
		
		try {
			cliente.adicionaEndereco(endereco);
		} catch (Exception e) {
			System.err.print("Houve um erro ao adicionar endereço: "+ e.getMessage());
		}
	}
}
