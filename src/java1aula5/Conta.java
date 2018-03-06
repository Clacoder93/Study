package java1aula5;

class Conta {
	int numero;
	Cliente titular;
	private double saldo;
	@SuppressWarnings("unused")
	private double limite;
	
	private static int numeroIncremental =1;

	// Construtores Atividade aula 6
	public Conta(int numero, double limite) {
		this.numero= numero;
		this.limite= limite;
	}

	public Conta() {
		this.numero = numeroIncremental;
		numeroIncremental++;
	}
	
	

	//métodos
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
