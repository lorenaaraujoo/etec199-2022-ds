public class SavingsAccount extends Account{

	public SavingsAccount(int number, int agency, double balance, String accountHolder) {
		super(number, agency, balance, accountHolder);
	}
	
	public double savingsIncome() {
		return (this.balance * 0.09);
	}
	
	@Override
	public void accountInfo() {
		System.out.println("Nome do titular da conta: " + this.getAccountHolder());
		System.out.println("N�mero da conta: " + this.getNumber());
		System.out.println("N�mero da ag�ncia: " + this.getAgency());
		System.out.println("Rendimento da poupan�a: " + this.savingsIncome());
		System.out.println("Saldo da conta: " + this.getBalance());
	}
}