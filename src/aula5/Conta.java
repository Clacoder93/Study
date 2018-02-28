package aula5;

class Conta {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;

	// Construtores
	public Conta(int numero, double limite) {

	}

	public Conta() {

	}

	public void saca(double qtd) {
		if (qtd < this.saldo) {
			this.saldo -= qtd;
		} else {

			System.out.println("Saldo insuficiente");
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setLimite(double novoLimite) {
		this.limite = novoLimite;
	}
}

class Cliente {
	String nome;
	String endereço;

}
