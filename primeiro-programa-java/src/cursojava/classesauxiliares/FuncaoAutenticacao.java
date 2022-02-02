package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

//Calsse mais extrema de acesso a interface.
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;
	
	//public boolean autenticarCursoJava(PermitirAcesso acesso) 
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
