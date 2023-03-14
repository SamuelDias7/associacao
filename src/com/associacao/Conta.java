package com.associacao;

public class Conta {
	// Atributos
	private String numAgencia;
	private String numConta;
	private double saldo;
	
	// associação da classe Conta com a classe Pessoa
	private Pessoa cliente;

	// construtor
	public Conta(String numAgencia, String numConta, double saldo) {
		// TODO Auto-generated constructor stub
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	// Metodos
	public String consultarDadosConta() {
		return "Número da agência:" + this.numAgencia + "\nNúmero da conta:" + this.numConta + ".";
	}
	public String depositarValor(double valor) {
		this.saldo += valor;
		return "Depósito efetuado com sucesso!";
	}
	public String sacarValor(double valor) {
		if(this.saldo>valor){
			this.saldo -= valor;
			
			return "Saque efetuado com sucesso!";
		}
		else
			return "Não foi possível efetuar o saque!";
	}
	public double consultarSaldo() {
		return this.saldo; 
	}

	// Metodos de acesso ao atributo cliente
	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
}

