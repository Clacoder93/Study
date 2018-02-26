package aula4;
//Exerc�cio p�gina 50 apostila fj11 da Caelum > https://www.caelum.com.br/download/caelum-java-objetos-fj11.pdf

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
		System.out.println("Saldo atual � de: " + minhaConta.saldo + " R$");
		
		
		//saca 200 reais
		minhaConta.saca(200);
		
		//deposita 1000 reais
		minhaConta.depoista(1000);
		System.out.println("Ap�s opera��es banc�rias o saldo �: "+minhaConta.saldo);
		
	}

}

class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;

	void saca(double qtd) {
		double novosaldo = this.saldo - qtd;
		this.saldo = novosaldo;

	}
	void depoista(double qtd) {
		this.saldo += qtd;
	}

}