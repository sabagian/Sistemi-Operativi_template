import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class conditionCounter {
    //Classe utilizzata per tenere traccia in automatico del numero di 
    //thread sospesi su una particolare condition queue.
    private Condition c;
    private int sospesi=0;
    private Lock lock;

    public conditionCounter(Lock lock){
        this.lock=lock;
        this.c=lock.newCondition();
    }

    public boolean someWait(){
        if (sospesi>0){
            return true;
        }else return false;
    }

    public void await() throws InterruptedException{
        this.sospesi++;
        this.c.await();
        this.sospesi--;

    }

    public void signal(){
        this.c.signal();
    }

    public void signalAll(){
        this.c.signalAll();
    }

    public int get_sospesi(){
        return this.sospesi;
    }
}
