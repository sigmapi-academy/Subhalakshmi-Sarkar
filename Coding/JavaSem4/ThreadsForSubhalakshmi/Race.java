package ThreadsForSubhalakshmi;


/**
 * Write a description of class Race here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Race
{
    public static void main(String args[]){
        System.out.print("\fPassing:");
        Runner Jean = new Runner("Jean");
        Runner Paul = new Runner("Paul");
        Jean.start();
        Paul.start();
    }
}