public class PremiumAccount extends Account implements Taxation{
	double credit;
	
	public PremiumAccount(int number, int agency, double balance, double credit ,String accountHolder) {
		super(number, agency, balance, accountHolder);
		this.credit = credit;
	}
	
	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}
	
	@Override
	public double calcTax() {
		return this.balance * 0.01;
	}

	@Override
	public void accountInfo() {
		System.out.println("Nome do titular da conta: " + this.getAccountHolder());
		System.out.println("Número da conta: " + this.getNumber());
		System.out.println("Número da agência: " + this.getAgency());
		System.out.println("Crédito da conta: " + this.getCredit());
		System.out.println("Taxa imposta a conta: " + this.calcTax());
		System.out.println("Saldo da conta: " + this.getBalance());
	}
}