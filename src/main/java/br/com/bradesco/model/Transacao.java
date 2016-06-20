package br.com.bradesco.model;
/**
 * Transação class
 * @author Maciel
 *
 */
public class Transacao {

	public Transacao() {
	}
	
	private int id;
	private String estabelecimento;
	private int tipo;
	private String van;
	private double valor;
	private String status;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getVan() {
		return van;
	}

	public void setVan(String van) {
		this.van = van;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	
	
}
