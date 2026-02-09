package ThreadsForSubhalakshmi;


/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner extends Thread
{
    public Runner(String str){
        super(str);
    }
    
    @Override
    public void run(){
        int i;
        for(i = 1; i <= 10; i++){
            System.out.print("\n"+(i*100) + " m : " + getName());
            try
            {
                sleep((int)(Math.random() * 1000));
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}