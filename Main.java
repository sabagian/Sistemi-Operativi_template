
import java.util.Random;
import java.math.*;

public class Main extends Thread {
    public static void main(String[] args) {

		//Questo main è pensato per creare e far partire tre diverse classi di threads
        final int N_1 = 3; 
        final int N_2 = 3;
        final int N_3 = 3;
        Monitor m = new Monitor();

		//Eliminare le entità non necessarie 
        Entita[] array_1 = new Entita[N_1];
        Entita2[] array_2 = new Entita2[N_2];
        Entita3[] array_3 = new Entita3[N_3];
        Random r = new Random();

        
       Random ran = new Random();
       for (int i=0; i<Math.max(N_1, Math.max(N_2, N_3) ); i++) {
    	   Tipo tipo;//Stringa da modificare in funzione del dominio del problema

    	   if(i<N_1) {
    		   array_1[i]=new Entita(m, i, tipo, r);
    	   }
    	   if(i<N_2) {
    		   array_2[i]=new Entita2(m, i, tipo, r);
    	   }
    	   if(i<N_3) {
    		   array_3[i]=new Entita3(m, i, tipo, r);
    	   }
       }
       
       for (int i=0; i<Math.max(N_1, Math.max(N_2, N_3) ); i++) {
    	   if(i<N_1) {
    		   array_1[i].start();
    	   }
    	   if(i<N_2) {
    		   array_2[i].start();
    	   }
    	   if(i<N_3) {
    		   array_3[i].start();
    	   }
       }
       
       
       for (int i=0; i<Math.max(N_1, Math.max(N_2, N_3) ); i++) {
    	   try {
	    	   if(i<N_1) {
	    		   array_1[i].join();
	    	   }
	    	   if(i<N_2) {
	    		   array_2[i].join();
	    	   }
	    	   if(i<N_3) {
	    		   array_3[i].join();
	    	   }
    	   }catch(InterruptedException e) {}
       }
       
       m.stampa(); // funzione di riepilogo di quanto avvenuto nel monitor

    }
    
}
