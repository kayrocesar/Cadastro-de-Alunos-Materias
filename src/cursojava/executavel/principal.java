package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class principal {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");
		
		
		FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
		
		PermitirAcesso permitirAcesso= new Secretario(login, senha);
		
		

		if (autenticacao.autenticarCursoJava(permitirAcesso)) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			List<Aluno> alunosAprovados = new ArrayList<Aluno>();
			List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
			List<Aluno> alunosReprovados = new ArrayList<Aluno>();

			for (int qtd = 0; qtd <= 5; qtd++) {

				Aluno aluno1 = new Aluno();
				aluno1.setNome(JOptionPane.showInputDialog("Digite do aluno " + (qtd + 1)));

				aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: ")));
				// aluno1.setDataNascimento(JOptionPane.showInputDialog("Digite a sua data de
				// nascimento: "));
				// aluno1.setDataMatricula(JOptionPane.showInputDialog("Digite a sua matricula:
				// "));
				// aluno1.setNomeMae(JOptionPane.showInputDialog("Digite o nome da sua mãe: "));
				// aluno1.setNomePai(JOptionPane.showInputDialog("Digite o nome do seu pai: "));
				// aluno1.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF: "));
				// aluno1.setNomeEscola(JOptionPane.showInputDialog("Digite o nome da escola:
				// "));

				for (int pos = 1; pos <= 4; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Insira o nome da disciplina " + pos + ":");
					String notaDisciplina = JOptionPane.showInputDialog("Insira o nota da disciplina: " + pos + ":");
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.parseDouble(notaDisciplina));
					aluno1.getDisciplinas().add(disciplina);
				}
				alunos.add(aluno1);
			}

			for (Aluno aluno : alunos) { // separando em listas
				if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
					alunosAprovados.add(aluno);
				} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					alunosReprovados.add(aluno);
				} else {
					alunosRecuperacao.add(aluno);
				}
			}

			System.out.println("------------lista de alunosde aprovados------------");
			for (Aluno aluno : alunosAprovados) {
				System.out.println("O aluno " + aluno.getNome() + "está " + aluno.getAlunoAprovado());
			}

			System.out.println("------------lista de alunos de reprovados------------");
			for (Aluno aluno : alunosReprovados) {
				System.out.println("O aluno " + aluno.getNome() + "está " + aluno.getAlunoAprovado());
			}

			System.out.println("------------lista de alunos em recuperação-----------");
			for (Aluno aluno : alunosRecuperacao) {
				System.out.println("O aluno " + aluno.getNome() + " está em " + aluno.getAlunoAprovado());
			}

		}

		else {
			JOptionPane.showInternalMessageDialog(null, "Login e/ou senha incorreto! ");
		}
	}
}

// Remover alguma disciplina
/*
 * int option = JOptionPane.showConfirmDialog(null,
 * "Deseja remover alguma disciplina: ");
 * 
 * if (option == 0) {
 * 
 * int continuar = 0;
 * 
 * while (continuar == 0) { aluno1.getDisciplinas() .remove(Integer.parseInt(
 * JOptionPane.
 * showInputDialog("Qual disciplina você deseja remover: 1,2,3 ou 4 ?")) - 1);
 * continuar = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
 * 
 * }
 * 
 * } }
 * 
 * 
 * 
 * 
 * /* // Substituindo um aluno pelo nome na lista
 * 
 * int option = JOptionPane.showConfirmDialog(null,
 * "Deseja remover algum aluno pelo nome: "); if (option == 0) { String
 * nomeAlunoRemover =
 * JOptionPane.showInputDialog("Insira o nome do aluno a ser removido: "); for
 * (int i = 0; i < alunos.size(); i++) {
 * 
 * Aluno aluno = alunos.get(i);
 * 
 * if (aluno.getNome().equalsIgnoreCase(nomeAlunoRemover)) {
 * 
 * Aluno trocar = new Aluno(); trocar.setNome(JOptionPane.
 * showInputDialog("Insira o novo nome a ser inserido:  "));
 * 
 * Disciplina disciplina = new Disciplina();
 * disciplina.setDisciplina(JOptionPane.
 * showInputDialog("Insira a nova disciplina a ser inserida: "));
 * disciplina.setNota(Double.parseDouble(JOptionPane.
 * showInputDialog("Insira a nova nota a ser inserida: ")));
 * 
 * trocar.getDisciplinas().add(disciplina); alunos.set(i, trocar); } } }
 */
