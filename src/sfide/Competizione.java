package sfide;

import prog.utili.Orario;

public class Competizione extends Sfida {
	private static final int Incremento = 500;
	
	private static final int PUNTEGGIO_BASE = 1000;
	
	//punteggio del gioco da 1 a 10
	int punteggio;
	
	public Competizione(String ID, String descrizione, String p1, String p2, Orario o, boolean c, int p) throws OrarioNonValidoException {
		
		super(ID, descrizione, p1, p2, 0, c)
		punteggio = p;
		
	}
	
	@Override
	public int punteggio() {
		return PUNTEGGIO_BASE + punteggio + INCREMENTO;
		
	}
	
}
