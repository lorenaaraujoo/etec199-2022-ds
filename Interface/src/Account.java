
public abstract class Account {
	int number;
	int agency;
	double balance;
	String accountHolder;
	
	public Account(int number, int agency, double balance, String accountHolder) {
		this.number = number;
		this.agency = agency;
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getAgency() {
		return agency;
	}
	
	public void setAgency(int agency) {
		this.agency = agency;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balandce) {
		this.balance = balance;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void draw(double value) {
		if (value > this.balance) {
			System.out.println("Não é possível sacar um valor maior que o saldo existente na conta!");
			return;
		}
		if (value <= 0) {
			System.out.println("Não é possível sacar um valor menor ou igual a zero!");
			return;
		}
		this.balance -= value;
	}
	
	public void deposit(double value) {
		if (value <= 0) {
			System.out.println("Não é possível depositar um valor menor ou igual a zero!");
			return;
		}
		this.balance += value;
	}
	
	public void accountInfo() {
		System.out.println("Nome do titular da conta: " + this.getAccountHolder());
		System.out.println("Número da conta: " + this.getNumber());
		System.out.println("Número da agência: " + this.getAgency());
		System.out.println("Saldo da conta: " + this.getBalance());
	}
}
