# vaerini_andrea_info2
Progetto info2 per la prova di febbraio 2021

In primo luogo definisco una classe GestoreSfide che è 
la mia classe principale. I campi sono costituiti da: 
orario in cui la sfida si è tenuta, il nome dei due 
partecipanti e la sua validità, la quale può essere o campionato 
o amichevole (utilizzo dunque dei boolean). Infine l'orario non
consentito è prima delle 6 e dopo le 23, per i quali creo delle
eccezioni controlare.  Esistono tre sottoclassi di sfide: 
pacifiche, normali e competizione.   

Main: Per la lettura da file utilizzo il metodo "leggiDaFile".
Inserisco una nuova sfida con il metodo inserisci e inizialmente
stampo le sfide in ordine di tempo. Successivamente stampo le 
sfide in ordine di punteggio. 