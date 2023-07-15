

import java.util.Random;

public class Entita2 extends Thread {

    ////////////////////////////////////////////////////
    /// UTILIZZARE LA FUNZIONE DI REFACTOR DI ECLIPSE///
    /// PER MODIFICARE IL NOME DI FUNZIONI, CONDITION///
    ///             ED ENTITà                        ///   
    ////////////////////////////////////////////////////

    private Monitor m;
    private int id;
    private Tipo tipo;
    private Random r;

    public Entita2(Monitor m, int id, Tipo tipo, Random r) {
        this.m = m;
        this.id = id;
        this.tipo = tipo;
        this.r=r;
    }

    public int getID() {
        return this.id;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void run() {

        try {
            
            m.entra2(this.getID(), 0,this.getTipo());
            Thread.sleep(500);
            m.esce2(this.getID(), 0,this.getTipo());
            Thread.sleep(500); 
            m.entra2(this.getID(), 1,this.getTipo());
            Thread.sleep(500); 
            m.esce2(this.getID(), 1,this.getTipo());

        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
    }
}
