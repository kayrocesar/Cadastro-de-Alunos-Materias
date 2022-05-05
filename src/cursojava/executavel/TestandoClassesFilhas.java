package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
     public static void main(String[] args) {
    	 
		Aluno aluno = new Aluno();
		aluno.setNome("Egidio");
		aluno.setSerieMatriculado("5 serie");
		aluno.setIdade(17);
		System.out.println(aluno.pessoaMaiorIdade());
		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Antonio");
		diretor.setTempoDirecao(60);
		diretor.setTitulacao("Senior");
		diretor.setIdade(50);
		System.out.println(diretor.pessoaMaiorIdade());
		
		
		Secretario sec = new Secretario();
		sec.setExperiencia("iniciante");
		sec.setNome("Fernando");
		sec.setIdade(25);
		System.out.println(sec.pessoaMaiorIdade());
		
		System.out.println(sec);
		
		
		System.out.println("Salário do aluno é R$ " +aluno.salario());
		System.out.println("Salário do diretor é R$ " +diretor.salario());
		System.out.println("Salário do secretário é R$ " +sec.salario());
		
		
	}
}
