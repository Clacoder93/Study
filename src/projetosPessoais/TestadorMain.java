package projetosPessoais;

class TestadorMain {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2= new Conta();
		Conta c3 = new Conta();
		
		
		c1.getTitular().setNome("Lino");
		c1.getTitular().setIdade(24);
		c1.getTitular().setSexo("m");
		c1.getTitular().setSobrenome("Veloso");
		
		c1.setNumero(123);
		c1.setSaldo(5000);
		c1.setAgencia("4578-8");
		c1.setLimite(50000.0);
		
		
		
		c2.setNumero(321);
		c2.setSaldo(1000);
		c2.setAgencia("9874-3");
		
	
		
		c3.setNumero(954);
		c3.setSaldo(45000);
		c3.setAgencia("78965-1");

		
		System.out.println("o saldo do titular é: "+c1.getSaldo());
		System.out.println("o saldo do titular é: "+c2.getSaldo());
		
		c2.transfere(c1, 1500.0);
		
		
	}

}
