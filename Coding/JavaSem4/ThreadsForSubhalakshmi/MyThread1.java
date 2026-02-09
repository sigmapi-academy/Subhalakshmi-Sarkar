package ThreadsForSubhalakshmi;

/**
 * Write a description of class MyThread1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyThread1 extends Thread
{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.print("\nSita Thread");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }
}