package ThreadsForSubhalakshmi;


/**
 * Write a description of class ThreadJoinDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ThreadJoinDemo
{
    public static void main(String args[]) throws InterruptedException{
        MyThread1 t = new MyThread1();
        t.start();
        t.join(5000, 100);
        for(int i = 0; i < 10; i++){
            System.out.print("\nRam Thread");
        }
    }
}