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
	private Pessoa titular;

	
	//Getter and setters

	public Pessoa getTitular() {
		return titular;
	}


	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public String getAgencia() {
		return agencia;
	}

	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	
	public double getSaldo() {
		return saldo;
	}

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	//métodos

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
		if (verifica(valorTransfer)) {
			this.setSaldo(this.getSaldo() - valorTransfer);
			destino.setSaldo(destino.getSaldo() + valorTransfer);
			System.out.println("Transferência realizado com sucesso");
			
		} else {
			System.out.println("Transferência não realizada");
		}
	}

	public boolean verifica(double valor) {
		if (this.getSaldo() <= valor) {
			System.out.println("Saldo insuficiente");
			return false;

		} else {
			return true;
		}
	}
}

class Pessoa {
	private String nome="";
	private String sobrenome="";
	private String sexo="";
	private int idade;
	
	
	//Getter and setters
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
}