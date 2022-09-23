public class CheckingAccount extends Account implements Taxation{

	public CheckingAccount(int number, int agency, double balance, String accountHolder) {
		super(number, agency, balance, accountHolder);
	}
	
	@Override
	public double calcTax() {
		return (this.balance * 0.02);
	}
	
	@Override
	public void draw(double value) {
		if (value <= 0) {
			System.out.println("Não é possível sacar um valor menor ou igual a zero!");
			return;
		}
		
		value += 5;
		
		if (value > this.balance) {
			System.out.println("Não é possível sacar um valor que seja maior que o saldo da conta! Lembre-se que há uma taxa de 5 reais para cada saque!");
			return;
		}		
		this.balance -= value;
	}
	
	@Override
	public void accountInfo() {
		System.out.println("Nome do titular da conta: " + this.getAccountHolder());
		System.out.println("Número da conta: " + this.getNumber());
		System.out.println("Número da agência: " + this.getAgency());
		System.out.println("Taxa imposta a conta: " + this.calcTax());
		System.out.println("Saldo da conta: " + this.getBalance());
	}
}