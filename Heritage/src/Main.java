
public class Main {
	public static void main(String[] args) {
		
		Client Client = new Client();
		Client.setName("Lorena");
		Client.setAddress("Rua: Henrique Adamus, 16");
		Client.setOrder_value(500);
		
		System.out.println(Client.getName()+ ", the total amount of your purchase was: "+Client.calculateDiscount());
		
		
		//Client Premium
		
		ClientPremium ClientKarina = new ClientPremium();
		ClientKarina.setName("Karina");
		ClientKarina.setAge(16);
		ClientKarina.setAddress("Rua: Souza Ramos, 632");
		ClientKarina.setOrder_value(200);
		
		System.out.println();
		System.out.println(ClientKarina.getName()+ ", the total amount of your purchase (with discount) was: "+ClientKarina.calculateDiscount());
	}
}
