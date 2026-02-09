package ThreadsForSubhalakshmi;

/**
 * Write a description of class Q here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChatAndLaunchTheParrot2
{
    public static void main(String args[]){
        //Parrot parrot = new Parrot("RAMA", 10);
        //blabla(); blabla();
        Parrot2 parrot2 = new Parrot2("RAMA", 10);
        Thread tparrot = new Thread(parrot2);
        tparrot.start();
        for(int i = 0; i < 10; i++){
            blabla();            
        }
    }

    public static void blabla(){
        System.out.print("\nblabla");
    }
}