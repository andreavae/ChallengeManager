package main;

import prog.utili.Orario; 
import sfide.Normale; 
import sfide.OrarioNonValidoException; 
import sfide.Pacifica;

public class Prova {

	public static void main(String[] args) throws OrarioNonValidoException {
		Orario o = new Orario(12,30);
		Pacifica P = null; 
		
		try {
			   p = new Pacifica("P1", "sfida", "Pluto", "Pippo", o, true);	
			   System.out.println(p);
			   System.out.println(p.punteggio());
		} catch (OrarioNonValidoException e) {
			e.printStackTrace();
		}
		
		try {
			Orario o2 = new Orario(6,30);
			Normale n = new Normale("N1", "sfida", "Pluto", "Pippo", o2, true,"bergamo");	
      } catch (OrarioNonValidoException e) {
    	  System.out.println("ORARIO NON VALIDO");
    	  System.out.println("come orario non valido era " + e.orarioNonValido);
    	  
      }
		
		Orario o2 = new Orario(14, 30); 
		Normale n2 = new Normale("SSS","PP", "p2", o2, false, "QUI"); 
		System.out.println(n2);
		
		
		System.out.println("GESTIONE SFIDE"); 
		GestoreSfide gs = new GestoreSfide(); 
		gs.inserisci(n2); 
		gs.inserisci(p);
			
		// stampo
		gs.printTime();

	}

} 
