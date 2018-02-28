package projetosPessoais;

/*
*código elaborado sem consulta
*
*@author claCoder
*
*/
class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	private double limite;
	Pessoa titular;

	public void sacar(double valorSaque) {
		if (this.saldo < valorSaque) {
			System.out.println("Saldo insuficiente");
		} else {
			this.saldo -= valorSaque;
		}

	}

	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public void transfere(Conta destino, double valorTransfer) {
		if (verifica(destino, valorTransfer)) {
			destino.saldo -= valorTransfer;
		} else {
			this.saldo += valorTransfer;
		}
	}

	public boolean verifica(Conta destino, double valor) {
		if (destino.saldo <= valor) {
			return false;
		} else {
			return true;
		}
	}
}

class Pessoa {
	private String nome;
	private String sobrenome;
	private String sexo;
	private int idade;
}