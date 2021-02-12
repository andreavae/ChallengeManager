package main;

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.List;
import sfide.Sfida;

// gestisce tutte le sfide
 
public class GestoreSfide {
	
	List<Sfida> sfide = new ArrayList<>();
	
	//leggi da file
	public void leggiDaFile() {
		
		//TODO 
		// legge dal file sfide.txt e le copia in sfide
		
	}
	
	//inserisci una sfida
	public void inserisci(Sfida s) {
		sfide.add(s);
	}
	
	//stampa in ordine di tempo
	public void printTime() {
		//ordinare le sfide in ordine di tempo
		Collection.sort(sfide);
		
		//stampare
		for(Sfida s: sfide) {
			// TODO formattarle 
			System.out.println(s);
				
		}
				
	}
	
}
