package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

public class Disciplina {

	private Double nota[] = new Double[4];
	private String disciplina;

	

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	
	public Double[] getNota() {
		return nota;
	}
	
	public Double maiorNota() {// consultar maior nota na lista de notas de uma disciplina
		double maior=0.0;
		Double consultaNotas[]= getNota();
		for (int i = 0; i < nota.length; i++) {
			if(consultaNotas[i]>maior) {
				maior=consultaNotas[i];
			}
		}
		return maior;
	}
	public Double menorNota() { // consultar menor nota na lista de notas de uma disciplina
		double menor=0.0;
		Double consultaNotas[]= getNota();
		for (int i = 0; i < nota.length; i++) {
			if(i==0) {
				menor=consultaNotas[i];
			}
			else if(consultaNotas[i]<menor) {
				menor=consultaNotas[i];
			}
		}
		return menor;
	}

	public void setNota(Double[] nota) {
		this.nota = nota;
	}
	
	public double getMediaNota()
	{
		double soma=0.0;
		for (int i = 0; i < nota.length; i++) {
			soma+=nota[i];
		}
		return soma/4;
	}
	
	public String StatusMateria() {
		
		if(getMediaNota()<5) {
			return StatusAluno.REPROVADO;
		}
		else if(getMediaNota()>=5 && getMediaNota()<7) {
			return StatusAluno.RECUPERACAO;
		}
		else {
			return StatusAluno.APROVADO;
		}
	}
	
	@Override
	public String toString() { // Retorna array de notas 
		return Arrays.toString(nota) ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}
	
	
	
	
	

}
