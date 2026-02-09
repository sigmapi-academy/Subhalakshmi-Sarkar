package ThreadsForSubhalakshmi;


/**
 * Write a description of class ThreadInterruptedDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThreadInterruptedDemo
{
    public static void main(String args[])throws InterruptedException{
        MyThread3 t = new MyThread3();
        t.start();
        t.interrupt();
        Thread.sleep(5000);
        System.out.print("\nEnd of main");
    }
}