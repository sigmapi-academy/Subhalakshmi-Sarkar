package ThreadsForSubhalakshmi;


/**
 * Write a description of class Thread2JoinDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Thread2JoinDemo
{
    public static void main(String args[]){
        MyThread2.init = Thread.currentThread();
        MyThread2 t = new MyThread2();
        t.start();
        try
        {
            t.join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
        for(int i = 0; i < 10; i++){
            System.out.print("\nMain Thread");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}