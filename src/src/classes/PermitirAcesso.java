package src.classes;

//Essa interface será o nosso contrato de autenticação

public interface PermitirAcesso {
	
	public boolean autenticar(String login,String senha);// apenas declaração do método
	public boolean autenticar();// apenas declaração do método

}
