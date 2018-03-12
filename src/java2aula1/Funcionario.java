package java2aula1;

class Funcionario {
	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public double getBonus() {
	return this.salario * 0.2;
	}

}

class testaFuncionario {
	public static void main(String[] args) {
		Funcionario lino = new Funcionario();
		lino.setSalario(1000.0);
		
		System.out.println(lino.getBonus());
	}
}
