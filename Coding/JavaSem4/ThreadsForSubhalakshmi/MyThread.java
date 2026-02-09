package ThreadsForSubhalakshmi;


/**
 * Write a description of class MyThread here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyThread extends Thread
{
    public void run(){
        int i;
        for(i = 0; i < 10; i++){
            System.out.print("\nChild Thread");
            Thread.yield();  //1
            try{
                Thread.sleep(1000);    
            }
            catch(InterruptedException io){
                
            }
        }
    }
}