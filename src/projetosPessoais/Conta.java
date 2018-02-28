package projetosPessoais;

/*
*código elaborado sem consulta
*
*@author claCoder
*
*/
class Conta {
	private int numero;
	private String agencia;
	private double saldo;
	private double limite;
	Pessoa titular;

	/**
	 * @return the agency
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agency to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void sacar(double valorSaque) {
		if (this.getSaldo() < valorSaque) {
			System.out.println("Saldo insuficiente");
		} else {
			this.setSaldo(this.getSaldo() - valorSaque);
		}

	}

	public void depositar(double valorDeposito) {
		this.setSaldo(this.getSaldo() + valorDeposito);
	}

	public void transfere(Conta destino, double valorTransfer) {
		if (verifica(destino, valorTransfer)) {
			destino.setSaldo(destino.getSaldo() - valorTransfer);
		} else {
			this.setSaldo(this.getSaldo() + valorTransfer);
		}
	}

	public boolean verifica(Conta destino, double valor) {
		if (destino.getSaldo() <= valor) {
			System.out.println("Saldo insuficiente");
			return false;
			
			
		} else {
			return true;
		}
	}
}

class Pessoa {
	 String nome;
	 String sobrenome;
	 String sexo;
	 int idade;
}