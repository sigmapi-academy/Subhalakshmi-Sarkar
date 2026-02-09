package ThreadsForSubhalakshmi;


/**
 * Write a description of class DeadLock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeadLock
{
    public static void main(String arg[]){
        try
        {
            Thread.currentThread().join();
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}