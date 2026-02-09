package ExceptionHandling;
import java.util.*;


/**
 * Write a description of class EHExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EHExample
{
    public static void main(String args[]){
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter two numbers: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        double r = x / y;
        System.out.print("\nResult: " + r);
    }
}