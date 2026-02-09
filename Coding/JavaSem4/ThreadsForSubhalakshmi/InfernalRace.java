package ThreadsForSubhalakshmi;


/**
 * Write a description of class InfernalRace here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InfernalRace
{
    public static void main(String args[]){
        System.out.print("\f");
        Runner1 A = new Runner1("Kevin");
        Runner1 B = new Runner1("Jack");
        A.setPriority(Thread.MIN_PRIORITY);
        B.setPriority(Thread.MAX_PRIORITY);
        System.out.print("\nThread runner " + A.nm + " has priority = "+
        A.getPriority());
        System.out.print("\nThread runner " + B.nm + " has priority = "+
        B.getPriority());
        
        A.start();
        B.start();
    }
}