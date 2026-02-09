package ThreadsForSubhalakshmi;
import java.util.*;


/**
 * Write a description of class InitiateParrot3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InitiateParrot3
{
    public static void main(String args[]){
        Timer timer = new Timer();
        Parrot3 parrot = new Parrot3("Tuffy", 3);
        String response = "yes";
        //timer.schedule(parrot, 10000);
        timer.schedule(parrot, 10000, 4000);
        do{
            System.out.print("\nBlabla");
            System.out.print("\nBlabla");
            System.out.print("\nWould you like to continue chatting? (Y/N) ");
            response = new Scanner(System.in).next();
        }while(response.equalsIgnoreCase("Y"));
        timer.cancel();
    }
}