package ExceptionHandling;
import java.util.*;


/**
 * Write a description of class EHExample2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EHExample2
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x, y, z = 0;
        System.out.print("\fEnter the value of x: ");
        x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        y = sc.nextInt();
        
        try{
            z = x / y;
            System.out.print("\nResult: " + z);
        }
        catch(ArithmeticException ae){
            System.err.print("\nCannot Divide by Zero");
        }
        finally{
            System.out.print("Finally block is always executed.");
        }
        System.out.print("\nRest of the code....");
    }
}