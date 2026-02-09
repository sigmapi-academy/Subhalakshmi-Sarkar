package ExceptionHandling;
import java.util.*;


/**
 * Write a description of class EHExample6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EHExample6
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x, y, r;
        System.out.print("\fEnter any integer value: ");
        x = sc.nextInt();
        System.out.print("Enter any integer value: ");
        y = sc.nextInt();
        int ar[] = new int[5];
        try{
            try{
                r = x / y;
                System.out.print("\nResult = " + r);
            }
            catch(ArithmeticException e){
                System.err.print("\nCannot divide by zero.");
            }
            try{
                System.out.print("\nEnter 5 integer values: \n");
                for(int i = 0; i <= ar.length; i++){
                    ar[i] = sc.nextInt();
                }
            }
            catch(ArrayIndexOutOfBoundsException aiobe){
                System.err.print("Array index out of bounds.");
            }
        }
        catch(Exception e){
            System.err.print("\nHandle other exceptions");
        }
        System.out.print("\nRest of the code...");
    }
}