package aula4;
//Exercício página 50 apostila fj11 da Caelum > https://www.caelum.com.br/download/caelum-java-objetos-fj11.pdf

class ex1 {
	public static void main(String[] args) {
		// criando a conta
		Conta minhaConta = new Conta();

		// colocando alguns dados
		minhaConta.titular = "Lino";
		minhaConta.numero = 789;
		minhaConta.saldo = 2500.0;
		minhaConta.limite = 1500.0;

		// mostrando o valor do saldo
		System.out.println("Saldo atual é de: " + minhaConta.saldo + " R$");

		// saca 200 reais
		minhaConta.saca(200);

		// deposita 1000 reais
		minhaConta.deposita(1000);
		System.out.println("Após operações bancárias o saldo é: " + minhaConta.saldo);

	}

}

class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;

	boolean saca(double qtd) {
		if (this.saldo < qtd) {
			return false;
		} else {
			this.saldo -= qtd;
			return true;
		}

	}

	void deposita(double qtd) {
		this.saldo += qtd;
	}

}