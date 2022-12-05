package br.com.caelum.contas.modelo;

/**
 * Classe responsável por moldar as Contas do Banco
 * 
 * @author bmacedo
 *
 */

public class Conta {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	/**
	 * Método que indrementa o saldo.
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getTitular() {
		return this.titular;
	}

	public String getTipo() {
		return "Conta";
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
}
