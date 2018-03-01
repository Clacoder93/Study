package aula5;

class TesteModificador {

	public static void main(String[] args) {
		Conta joao = new Conta();

		joao.numero = 123;
		joao.titular.nome="Lino";
		joao.setLimite(100);
		
		joao.deposita(500.0);
		joao.saca(1000.0);

		System.out.println(joao.getSaldo());

	}

}
