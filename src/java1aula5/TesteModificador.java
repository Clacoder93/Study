package java1aula5;

class TesteModificador {

	public static void main(String[] args) {
		Conta c1 = new Conta(123, 100.0);

		//c1.numero = 123;
		//c1.setLimite(100);
		
		c1.deposita(500.0);
		c1.saca(1000.0);

		System.out.println(c1.getSaldo());

	}

}
