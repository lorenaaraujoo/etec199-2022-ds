package poo;

public class Pessoa {
	
	private static final int Tamanho_CPF = 11;
	private static final int Tamanho_CNPJ = 14;
	
	public enum TipoPessoa{Fisica, Juridica}
	
	public Integer codigo;
	public String nome;
	private String documento;
	public TipoPessoa tipo;
	
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		if(documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento não pode ser nulo ou vazio");
		}
		
		if(documento.length() == Tamanho_CPF) {
			setDocumento(documento, tipo = TipoPessoa.Fisica);
		} 
		else if(documento.length() == Tamanho_CNPJ){
			setDocumento(documento, tipo = TipoPessoa.Juridica);
		}
		else {
			throw new RuntimeException("Documento inválido para pessoa física ou jurídica!");
		}
	}
	
	private void setDocumento(String documento, TipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}
	
	private void getTipoPessoa() {
		// TODO Auto-generated method stub

	}
}
