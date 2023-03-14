package com.associacao;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		Pessoa cliente = new Pessoa(10011);
		Conta conta = new Conta("9898", "6565", 0);
		
		// Declçarão de variaveis
		String valor;
		
		// Declaração de array
		Object[] opcoes = {"Consultar dados do cliente","Consultar dados da conta", "Consultar saldo", "Depositar", "Sacar", "Sair"};
		Object opcao;
		
		// recebe os dados do cliente
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente:"));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente:"));
		cliente.setProfissao(JOptionPane.showInputDialog("Informe a profissão do cliente:"));
		
		// associando os dados do cliente ao objeto conta
		conta.setCliente(cliente);
		
		do {
			
			// Informa para o cliente as opções
			opcao = JOptionPane.showInputDialog(null, "Escolha o que deseja fazer","Caixa eletrônico",JOptionPane.INFORMATION_MESSAGE,null,opcoes,opcoes[0]);
			
			//Realiza o desejo do cliente
			if(opcao=="Consultar dados do cliente")
				JOptionPane.showMessageDialog(null, "Nome do cliente da conta:" + conta.getCliente().getNome() + ".\nId do cliente:" + conta.getCliente().getIdPessoa() + ".\nTelefone:" + conta.getCliente().getTelefone() + ".\nProfissão:" + conta.getCliente().getProfissao() + ".	");
			else if(opcao=="Consultar dados da conta")
			JOptionPane.showMessageDialog(null, conta.consultarDadosConta());
			
			else if (opcao=="Consultar saldo")
				JOptionPane.showMessageDialog(null, conta.consultarSaldo());
			
			else if(opcao=="Depositar") {
				
				valor = JOptionPane.showInputDialog("Informe a quantidade do deposito que deseja fazaer");
				valor = valor.replace(",", ".");
				valor = conta.depositarValor(Double.parseDouble(valor));
				JOptionPane.showMessageDialog(null, valor);
			}
			else if(opcao=="Sacar"){
				
				valor = JOptionPane.showInputDialog("Informe o valor do saque que deseja efetuar");
				valor = valor.replace(",", ".");
				valor = conta.sacarValor(Double.parseDouble(valor));
				JOptionPane.showMessageDialog(null, valor);
			}
			else
				JOptionPane.showMessageDialog(null, "Obrigado pela preferência");
				
		}while(opcao != "Sair");
		
		// Encerra o programa
		System.exit(0);
			
	
	}

}
