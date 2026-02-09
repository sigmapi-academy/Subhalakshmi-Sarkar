package ThreadsForSubhalakshmi;


/**
 * Write a description of class ChatAndLaunchTheParrot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChatAndLaunchTheParrot
{
    public static void main(String args[]){
        //Parrot parrot = new Parrot("RAMA", 10);
        //blabla(); blabla();
        Parrot1 parrot = new Parrot1("RAMA", 10);
        Thread tparrot = new Thread(parrot);
        tparrot.start();
        for(int i = 0; i < 10; i++){
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException ie)
            {
                System.exit(1);
            }
            blabla();            
        }
    }
    public static void blabla(){
        System.out.print("\nblabla");
    }
}