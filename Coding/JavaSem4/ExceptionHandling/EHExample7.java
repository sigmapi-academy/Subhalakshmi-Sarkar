package ExceptionHandling;
import java.util.*;


/**
 * Write a description of class EHExample7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EHExample7
{
    public static void main(String args[]){
        int x, y;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("\fEnter the value of x: ");
            x = sc.nextInt();
            System.out.print("Enter the value of y: ");
            y = sc.nextInt();
            method1(x, y);
        }
        catch(Exception e){
            System.err.print("\nException is handled in main()");
            System.err.print("\n" + e.getMessage()+"\n\n");
            e.printStackTrace();
        }
    }
    
    public static void method1(int x, int y){
        method2(x, y);
    }
    
    public static void method2(int x, int y){
        method3(x, y);
    }
    
    public static void method3(int x, int y){
        int r = x/y;
        System.out.print("\nResult = " + r);
    }
}