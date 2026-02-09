package ThreadsForSubhalakshmi;


/**
 * Write a description of class Clock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clock extends Thread
{
    /**
     * Constructor for objects of class Clock
     */
    public Clock()
    {
        setDaemon(true);
    }
    
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(300);    
            }
            catch(InterruptedException e){
                
            }
            System.out.print("\ntick");
        }
    }
    public static void main(String args[]){
        System.out.print("\f");
        Clock ck = new Clock();
        ck.start();
    }
}
