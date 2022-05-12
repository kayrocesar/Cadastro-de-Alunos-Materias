package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		Double notas1[] = { 3.0, 6.0, 7.0, 8.0 };
		Double notas2[] = { 5.0, 5.0, 5.0, 4.1 };

		Aluno alunos[] = new Aluno[2];

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Cesar");

		Disciplina disc1 = new Disciplina();
		disc1.setDisciplina("Port");
		disc1.setNota(notas1);
		aluno1.getDisciplinas().add(disc1);

		Disciplina disc2 = new Disciplina();
		disc2.setDisciplina("Mat");
		disc2.setNota(notas2);
		aluno1.getDisciplinas().add(disc2);

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Caio");

		disc1.setDisciplina("Redação");
		disc1.setNota(notas1);
		aluno2.getDisciplinas().add(disc1);

		disc2.setDisciplina("SGBD");
		disc2.setNota(notas2);
		aluno2.getDisciplinas().add(disc2);

		alunos[0] = aluno1;
		alunos[1] = aluno2;

		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = alunos[i];
			System.out.println("Nome do aluno: " + aluno.getNome());

			
			System.out.println("Lista de disciplinas: ");
			for (Disciplina disc : aluno.getDisciplinas()) {
				System.out.println(
						disc.getDisciplina() + " - Notas: " + disc.toString() + "- Média: " + disc.getMediaNota());
				System.out.println("Maior nota da disciplina " + disc.getDisciplina() + " é " + disc.maiorNota());
				System.out.println("Menor nota da disciplina " + disc.getDisciplina() + " é " + disc.menorNota());
				System.out.println("\n");
			}

		}
	}
}
