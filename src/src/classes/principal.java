package src.classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class principal {

	public static Aluno cadastrarAluno() {

		Aluno aluno = new Aluno();
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno "));
		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: ")));
		aluno.setDataNascimento(JOptionPane.showInputDialog("Digite a sua data de nascimento: "));
		aluno.setDataMatricula(JOptionPane.showInputDialog("Digite a sua matricula: "));
		aluno.setNomeMae(JOptionPane.showInputDialog("Digite o nome da sua mae: "));
		aluno.setNomePai(JOptionPane.showInputDialog("Digite o nome do seu pai: "));
		aluno.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF: "));
		aluno.setNomeEscola(JOptionPane.showInputDialog("Digite o nome da escola: "));
		aluno.setSerieMatriculado(JOptionPane.showInputDialog("Digite a serie: "));
		return aluno;
	}

	public static boolean autenticar() {

		String login = JOptionPane.showInputDialog("Informe o login: ");
		String senha = JOptionPane.showInputDialog("Informe a senha: ");

		FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();

		PermitirAcesso permitirAcesso = new Secretario(login, senha);

		if (autenticacao.autenticarCursoJava(permitirAcesso)) {
			return true; // autenticando
		} else {
			return false;
		}

	}

	public static List<Disciplina> cadastrarDisciplinas(){
		
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		// inserindo n disciplinas para cada aluno
		for (int pos = 1; pos <= 2; pos++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Insira o nome da disciplina " + pos + ":");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			Double notas[] = new Double[4];

			// Inserindo 4 notas para cada disciplina
			for (int i = 0; i < disciplina.getNota().length; i++) {

				notas[i] = Double.parseDouble(JOptionPane.showInputDialog(
						"Insira a nota " + (i + 1) + " de " + disciplina.getDisciplina() + " :"));

			}
			
			disciplina.setNota(notas);// inserindo lista de notas na disciplina em questao
			disciplinas.add(disciplina);
			
													
		}
		return disciplinas;
		
		
	
	
		
}

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>(); // lista de alunos

		if (autenticar()) { // chama funcao de autenticar login
			Aluno aluno = cadastrarAluno();

			
			aluno.setDisciplinas(cadastrarDisciplinas()); // adicionando disciplina na lista do aluno
			alunos.add(aluno); // adicionando aluno na lista de alunos
			
			
		}
		
		for (Aluno a : alunos) {
			System.out.println(a);
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
 * showInputDialog("Qual disciplina voc� deseja remover: 1,2,3 ou 4 ?")) - 1);
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
