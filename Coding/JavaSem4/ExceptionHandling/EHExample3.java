package ExceptionHandling;
import java.util.*;


/**
 * Write a description of class EHExample3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EHExample3
{
    public static void main(String args[]){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter age: ");
        age = sc.nextInt();
        
        if(age > 0 && age < 100){
            System.out.print("\nValid age.");
        }
        else{
            throw new ArithmeticException("Invalid age");
        }
    }
}