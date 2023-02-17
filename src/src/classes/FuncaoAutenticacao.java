package src.classes;



// Realmente e somente receber alguem que tem o contrato da interface de permitir
// acesso

public class FuncaoAutenticacao {
	
	public boolean autenticarCursoJava(PermitirAcesso acesso) {
		return acesso.autenticar();
	}

}
