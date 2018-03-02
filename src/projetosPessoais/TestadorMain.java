package projetosPessoais;


class TestadorMain {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Pessoa titular1 = new Pessoa();
		Conta c2= new Conta();
		Pessoa titular2 = new Pessoa();
		Conta c3 = new Conta();
		Pessoa titular3 = new Pessoa();
		
		
		c1.setTitular(titular1);
		c1.getTitular().setNome("Lino");
		c1.getTitular().setIdade(24);
		c1.getTitular().setSexo("m");
		c1.getTitular().setSobrenome("Veloso");
		
		c1.setNumero(123);
		c1.setSaldo(5000);
		c1.setAgencia("4578-8");
		c1.setLimite(50000.0);
		
		
		
		c2.setTitular(titular2);
		c2.getTitular().setNome("nome2");
		c2.getTitular().setIdade(54);
		c2.getTitular().setSexo("f");
		c2.getTitular().setSobrenome("sobrenome2");
		
		c2.setNumero(321);
		c2.setSaldo(1000);
		c2.setAgencia("9874-3");
		
	
		c3.setTitular(titular3);
		c3.getTitular().setNome("nome3");
		c3.getTitular().setIdade(40);
		c3.getTitular().setSexo("m");
		c3.getTitular().setSobrenome("sobrenome3");
		
		c3.setNumero(954);
		c3.setSaldo(45000);
		c3.setAgencia("78965-1");

		
		System.out.println("o saldo do titular "+ c1.getTitular().getNome()+" é: "+c1.getSaldo());
		System.out.println("o saldo do titular "+ c2.getTitular().getNome()+" é: "+c2.getSaldo());
		
		//teste de transferência com valor insuficiente.
		c2.transfere(c1, 1500.0);
		
		System.out.println("o saldo do titular "+ c1.getTitular().getNome()+" é: "+c1.getSaldo());
		System.out.println("o saldo do titular "+ c2.getTitular().getNome()+" é: "+c2.getSaldo());
		
		
	}

}
