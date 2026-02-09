package ThreadsForSubhalakshmi;

/**
 * Write a description of class MyThread3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyThread3 extends Thread
{
    @Override
    public void run(){
        for(int i = 0; i < 10000; i++){
            System.out.print("\nI am lazy thread: " + i);
            try{
                //for(int i = 0; i < 10; i++){
                //  System.out.print("\n I am lazy thread!");
                    Thread.sleep(1000);
                //}
            }
            catch(InterruptedException ie){
                System.out.print("\nI got interrupted!!!!");
            }
        }
        System.out.print("\nI want to sleep!!!");

    }
}