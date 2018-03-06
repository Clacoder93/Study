package java1aula4;

/**
 * @author claCoder Atividades desenvolvidas durante a aula 4 do curso JAVA I:
 *         Primeiros passos.
 */
class Turma {
	Aluno[] alunos;
	void imprimeInfo() {
		for (int i = 0; i < this.alunos.length; i++) {
			Aluno aluno = this.alunos[i];
			if (aluno == null) break;
			
			System.out.println("O nome do aluno é: "+ aluno.nome + " e a nota dele é: "+ aluno.notas);
		}
	}
}

class Aluno{
	String nome;
	int notas;
}
class TesteDaTurma {
	public static void main(String[] args) {
		Turma nTurma1 = new Turma();
		nTurma1.alunos = new Aluno[10];
		
		nTurma1.alunos[0] = new Aluno();
		nTurma1.alunos[0].nome = "Lino Veloso";
		nTurma1.alunos[0].notas = 9;
		
		nTurma1.alunos[1] = new Aluno();
		nTurma1.alunos[1].nome = "João da silva";
		nTurma1.alunos[1].notas = 2;
		
		nTurma1.alunos[2] = new Aluno();
		nTurma1.alunos[2].nome = "Miguel de Cervantes";
		nTurma1.alunos[2].notas = 10;
		
		nTurma1.alunos[3] = new Aluno();
		nTurma1.alunos[3].nome = "Bruno de Oliveira";
		nTurma1.alunos[3].notas = 4;
		

		nTurma1.imprimeInfo();

	}
}