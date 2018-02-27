package aula4;

class TestaEmpresaAULA5{
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.setFuncionarios(new Funcionario[10]);
		
		for (int i = 0; i < empresa.getFuncionarios().length; i++) {
	        Funcionario f = new Funcionario();
	        f.setSalario(1000 + i * 100);
	        empresa.adicionar(f);
		
		
		}
		
		empresa.mostraFuncionarios();
	}
}