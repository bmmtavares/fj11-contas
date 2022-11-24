package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;
	
	public void criaConta(Evento evento) {
		/*
		this.conta = new Conta();
		//this.conta.setAgencia("1234");
		this.conta.setAgencia(evento.getString("agencia"));
		//this.conta.setNumero(56789);
		this.conta.setNumero(evento.getInt("numero"));
		//this.conta.setTitular("Batman");
		this.conta.setTitular(evento.getString("titular"));
		*/
		String tipo = evento.getSelecionadoNoRadio("tipo");
		if(tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		}else if(tipo.equals("Conta Poupança")) {
			this.conta = new ContaPoupanca();
		}
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setTitular(evento.getString("titular"));
	}
	
	public void deposita(Evento evento) {
		//double valorDigitado = evento.getDouble("valor");
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDigitado);
	}
	
	public void saca(Evento evento) {
		//double valorDigitado = evento.getDouble("valor");
		double valorDigitado = evento.getDouble("valorOperacao");
		this.conta.saca(valorDigitado);
		
		/*if(this.conta.getTipo().equals("Conta Corrente")) {
			this.conta.saca(valorDigitado + 0.10);
		}else {
			this.conta.saca(valorDigitado);
		}*/
	}
	
	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}
	
}
