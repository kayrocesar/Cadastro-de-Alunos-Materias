package src.classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		try {

			//String login = JOptionPane.showInputDialog("Informe o login: ");
			//String senha = JOptionPane.showInputDialog("Informe a senha: ");

			//FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();


			//PermitirAcesso permitirAcesso = new Secretario(login, senha);

			//if (autenticacao.autenticarCursoJava(permitirAcesso)) {// autenticando

				List<Aluno> alunos = new ArrayList<Aluno>(); // lista de alunos

				int qtd_alunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja cadastrar? "));

				for (int k = 0; k < qtd_alunos; k++) {

					Aluno aluno1 = new Aluno();
					aluno1.setNome(JOptionPane.showInputDialog("Digite do aluno " + (k + 1)));

					aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: ")));
					aluno1.setDataNascimento(JOptionPane.showInputDialog("Digite a sua data de nascimento: "));
					aluno1.setDataMatricula(JOptionPane.showInputDialog("Digite a sua matricula: "));
					aluno1.setNomeMae(JOptionPane.showInputDialog("Digite o nome da sua mae: "));
					aluno1.setNomePai(JOptionPane.showInputDialog("Digite o nome do seu pai: "));
					aluno1.setNumeroCpf(JOptionPane.showInputDialog("Digite o CPF: "));
					aluno1.setNomeEscola(JOptionPane.showInputDialog("Digite o nome da escola: "));

					// inserindo n disciplinas para cada aluno
					for (int pos = 1; pos <= 1; pos++) {
						
						String nomeDisciplina = JOptionPane.showInputDialog("Insira o nome da disciplina " + pos + ":");
						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						Double notas[] = new Double[4];

						// Inserindo 4 notas para cada disciplina
						for (int i = 0; i < disciplina.getNota().length; i++) {

							notas[i] = Double.parseDouble(JOptionPane.showInputDialog(
									"Insira a nota " + (i + 1) + " de " + disciplina.getDisciplina() + " :"));

						}
						disciplina.setNota(notas);// inserindo lista de notas na disciplina em quest�o

						aluno1.getDisciplinas().add(disciplina); // adicionando disciplina na lista de disciplinas do
																	// aluno
					}
					alunos.add(aluno1); // adicionando aluno na lista de alunos
				
				

				System.out.println("------------Lista de alunos--------------------");// imprimindo lista de alunos
				for (Aluno aluno : alunos) {

					System.out.println("Aluno: " + aluno.getNome());
					System.out.println("------------Lista de disciplinas--------------------"); // imprimindo
																								// disciplinas de cada
																								// aluno
					for (Disciplina disc : aluno.getDisciplinas()) {
						System.out.println("Disciplina: " + disc.getDisciplina() + " Media: " + disc.getMediaNota()
								+ " Maior nota: " + disc.maiorNota() + " Menor nota: " + disc.menorNota() + " Status: "
								+ disc.StatusMateria());
					}

				}

			}


		} catch (NumberFormatException e) {

			StringBuilder saida = new StringBuilder();
			e.printStackTrace(); // imprime erro no console Java

			System.out.println("Mensagem: " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());

			}

		} catch (NullPointerException e) {

		} catch (Exception e) { // captura todas as excecoes nao previstas
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getClass().getName());
		} finally { // sempre e executado ocorrendo erros ou nao
			JOptionPane.showMessageDialog(null, "Obrigado por usar o programa!");
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
