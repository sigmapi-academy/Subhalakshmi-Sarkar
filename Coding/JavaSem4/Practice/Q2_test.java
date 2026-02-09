package Practice;
import java.util.*;


/**
 * Write a description of class Q2_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2_test
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("\fEnter m:");
        m=sc.nextInt();
        System.out.println("Enter n:");
        n=sc.nextInt();
        if(m<0 || m>10 ||n<2||n>6){
            System.out.println("Invalid input");
            System.exit(0);
        }
        Q2 ob= new Q2(m,n);
        ob.input();
        ob.display();
    }
}
