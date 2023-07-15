

import java.util.Random;

public class Entita extends Thread {

    ////////////////////////////////////////////////////
    /// UTILIZZARE LA FUNZIONE DI REFACTOR DI ECLIPSE///
    /// PER MODIFICARE IL NOME DI FUNZIONI, CONDITION///
    ///             ED ENTITà                        ///   
    ////////////////////////////////////////////////////

    private Monitor m;
    private int id;
    private Tipo tipo;
    private Random r;

    public Entita(Monitor m, int id, Tipo tipo, Random r) {
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
            m.entra1(this.getID(), 0,this.getTipo());
            Thread.sleep(500);
            m.esce1(this.getID(), 0,this.getTipo());
            Thread.sleep(500);
            m.entra1(this.getID(), 1,this.getTipo());
            Thread.sleep(300);
            m.esce1(this.getID(), 1, this.getTipo());
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
    }
}
