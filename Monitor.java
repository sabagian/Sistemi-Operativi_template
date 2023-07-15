


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Monitor {

    ////////////////////////////////////////////////////
    /// UTILIZZARE LA FUNZIONE DI REFACTOR DI ECLIPSE///
    /// PER MODIFICARE IL NOME DI FUNZIONI, CONDITION///
    ///             ED ENTITà                        ///   
    ////////////////////////////////////////////////////
    
    //COSTANTI
    private final int IN = 0;
    private final int OUT = 1;
 
    
    //VARIABILI IN FUNZIONE DEL PROBLEMA
    
    
    //CONDITION: gli array potrebbero non essere necessari
    private Lock lock = new ReentrantLock();
    private conditionCounter array1[] = new conditionCounter[2];
    private conditionCounter array2[] = new conditionCounter[2];
    private conditionCounter array3[] = new conditionCounter[2];
    
    public Monitor(int N) {

    	for(int i=0; i<2;i++) {
    		this.array1[i] = new conditionCounter(this.lock);
    		this.array2[i]=new conditionCounter(this.lock);
    		this.array3[i] = new conditionCounter(this.lock);
    		
    	}
    }
    
    

    //Seguono possibili template di metodi che definiscono il comportamento
    //dei thread in funzione della direzione e del tipo
    public void entra1(int id, int dir, Tipo tipo) throws InterruptedException {
        lock.lock();
        try{
            if(tipo==Tipo.TIPO1) {
            	
            	if(dir==this.IN) {
            		
            		
            	
            		
            		
            	}else if(dir==this.OUT) {
            		
            	
            		
            		
            	}
            	
            	System.out.println();
            	
            }else if(tipo==Tipo.TIPO2){
            	
            	if(dir==this.IN) {
            		
            	
            		
            		
            	}else if(dir==this.OUT) {
            		
            		
            		
            	}
            	System.out.println();
            }
            
        } finally {
            lock.unlock();
        }
    }
    
    
    public void entra2(int id, int dir, Tipo tipo) throws InterruptedException {
        lock.lock();
        try{
        	if(tipo==Tipo.TIPO1) {
            	
            	if(dir==this.IN) {
            		
            		
            	
            		
            		
            	}else if(dir==this.OUT) {
            		
            	
            		
            		
            	}
            	
            	System.out.println();
            	
            }else if(tipo==Tipo.TIPO2){
            	
            	if(dir==this.IN) {
            		
            	
            		
            		
            	}else if(dir==this.OUT) {
            		
            		
            		
            	}
            	System.out.println();
            }
            
        } finally {
            lock.unlock();
        }
    }
    
    public void esce1(int id, int dir, Tipo tipo) throws InterruptedException {
        lock.lock();
        try{
        	if(tipo==Tipo.TIPO1) {
            	
            	if(dir==this.IN) {
            		
            		
            	
            		
            		
            	}else if(dir==this.OUT) {
            		
            	
            		
            		
            	}
            	
            	System.out.println();
            	
            }else if(tipo==Tipo.TIPO2){
            	
            	if(dir==this.IN) {
            		
            	
            		
            		
            	}else if(dir==this.OUT) {
            		
            		
            		
            	}
            	System.out.println();
            }
        	
            
        } finally {
            lock.unlock();
        }
    }
    
    public void esce2(int id, int dir, Tipo tipo) throws InterruptedException {
        lock.lock();
        try{
        	if(tipo==Tipo.TIPO1) {
            	
            	if(dir==this.IN) {
            		
            		
            	
            		
            		
            	}else if(dir==this.OUT) {
            		
            	
            		
            		
            	}
            	
            	System.out.println();
            	
            }else if(tipo==Tipo.TIPO2){
            	
            	if(dir==this.IN) {
            		
            	
            		
            		
            	}else if(dir==this.OUT) {
            		
            		
            		
            	}
            	System.out.println();
            }
        	
            
        } finally {
            lock.unlock();
        }
    }
    
    private int oppo(int dir) {
    	if(dir==this.IN)
    		return this.OUT;
    	else 
    		return this.IN;
    }
    
   
    
    public void stampa() {
    	System.out.println("");
    	//da implementare, funzione di riepilogo di quanto avvenuto nel monitor
    }
}
 