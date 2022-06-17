public class Produto {
	private String nomeProduto;
	private double precoCusto, margemLucro, precoVenda;
	
	// SET's
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public void setPrecoVenda(double precoVenda) {
		if(precoVenda < precoCusto) {
			System.out.println("Deu pau chefia, a firma foi de base");
		}else {
			this.precoVenda = precoVenda;
		}
	}
	
	public void calcularMargemLucro() {
		this.margemLucro = (precoVenda - precoCusto);
	}
	
	// GET's
	public double getMargemLucro() {
		return this.margemLucro;
	}
	public double getMargemLucroPorcentagem() {
		return this.margemLucro/(precoCusto/100);
	}
}