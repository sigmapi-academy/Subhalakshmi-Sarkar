package ThreadsForSubhalakshmi;


/**
 * Write a description of class MyThread2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyThread2 extends Thread
{
    static Thread init;
    
    public void run(){
        try
        {
            init.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        for(int i = 0; i < 10; i++){
            System.out.print("\nChild thread");
        }
    }
}