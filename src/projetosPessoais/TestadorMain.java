package projetosPessoais;

class TestadorMain {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2= new Conta();
		Conta c3 = new Conta();
		
		c1.titular.nome = "Lino";
		c1.titular.idade = 24;
		c1.titular.sexo = "m";
		
		c1.setNumero(123);
		c1.setSaldo(5000);
		c1.setAgencia("4578-8");
		
		c2.titular.nome = "name3";
		c2.titular.idade = 23;
		c2.titular.sexo = "f";
		
		c2.setNumero(321);
		c2.setSaldo(1000);
		c2.setAgencia("9874-3");
		
		c3.titular.nome = "name3";
		c3.titular.idade = 45;
		c3.titular.sexo = "f";
		
		c3.setNumero(954);
		c3.setSaldo(45000);
		c3.setAgencia("78965-1");
		
		
	}

}
