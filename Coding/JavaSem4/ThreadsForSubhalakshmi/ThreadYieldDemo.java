package ThreadsForSubhalakshmi;


/**
 * Write a description of class ThreadYieldDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThreadYieldDemo
{
    public static void main(String args[]){
        MyThread t = new MyThread();
        t.start();
        t.setPriority(Thread.MAX_PRIORITY);
        int i;
        for(i = 0; i < 10; i++){
            System.out.print("\nMain Thread");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}