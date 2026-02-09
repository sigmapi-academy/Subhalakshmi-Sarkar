package ThreadsForSubhalakshmi;


/**
 * Write a description of class TestEcrivain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestEcrivain
{
    public static void main(String args[]){
        System.out.print("\f");
        Ecrivain ob1 = new Ecrivain("ABC");
        Ecrivain ob2 = new Ecrivain("XYZ");
        ob1.start();
        try
        {
            ob1.join();
        }
        catch (InterruptedException ie)
        {
            System.out.print(ie.getMessage()+"\n");
            System.exit(1);
        }
        ob2.start();
    }
}