package src.classes;

//Essa interface ser� o nosso contrato de autentica��o

public interface PermitirAcesso {
	
	public boolean autenticar(String login,String senha);// apenas declara��o do m�todo
	public boolean autenticar();// apenas declara��o do m�todo

}
