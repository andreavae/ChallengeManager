package sfide;

import prog.utili.Orario;

/**
 * @author andreavaerini
 * eccezione che avviene quando cerco di creare 
 * una sfida con orario sbagliato
 *
 */
public class OrarioNonValidoException extends Exception {
	
	public Orario orarioNonValido;
	
	OrarioNonValidoException (Orario o) {
		this.orarioNonValido = o;
		
	}


}
