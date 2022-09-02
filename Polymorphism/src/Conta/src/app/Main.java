package app;

public class Main {

	public static void main(String[] args) {
		Lucros Lucro = new Lucros(0);
		ContaCorrente CC01 = new ContaCorrente("Lorena Araujo", "000.000.000-15","4785-02", 2000);
		ContaPoupança CP01 = new ContaPoupança("Gabriel Goes", "000.000.000-00","4653-02", 40000);
		
		CC01.depositar(2000);
		CC01.sacar(54000);
		CC01.imprimirSaldo();

		CP01.depositar(2000);
		CP01.sacar(6000);
		CP01.atualizarSaldo();
		CP01.imprimirSaldo();
		
		Lucro.registrar(CP01);
		Lucro.registrar(CC01);
		
		
	}

}
