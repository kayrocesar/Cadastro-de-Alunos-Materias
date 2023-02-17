package src.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public Aluno() { /* Cria os dados na memória */

	}

	public Aluno(String nomePadrao, int idadePadrao) { /* Cria os dados na memória */
        nome  = nomePadrao;
        idade = idadePadrao;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	/* media do Aluno */
	public double getMediaNota() {

		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			
			somaNotas+= disciplina.getMediaNota();
			
		}

		return somaNotas / disciplinas.size();

	}

	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 5) {
			if (media >= 7) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	} 
	
	@Override // identifica metodo sobreescrito
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Aluno: " +getNome()+ " [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}
	
	

}