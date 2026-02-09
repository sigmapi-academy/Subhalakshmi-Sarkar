package ExceptionHandling;
import java.util.*;

/**
 * Write a description of class EHExample1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EHExample1
{
    public static void main(String args[]){
        int x, y, r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        try{
            r = x / y;
        }
        catch(ArithmeticException e){
            System.err.print("\nCannot divide by zero!!!");
            return; //exiting the main code.
        }
        System.out.print("\nResult: " + r);
    }
}