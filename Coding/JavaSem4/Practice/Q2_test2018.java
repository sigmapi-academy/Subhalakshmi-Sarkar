package Practice;
import java.util.*;

/**
 * Write a description of class Q2_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2_test2018
{
    public static void main(String args[]){
        int m,n;
        Scanner sc=new Scanner (System.in);
        System.out.println("\fEnter m:");
        m=sc.nextInt();
        System.out.println("Enter n:");
        n=sc.nextInt();
        if((m>2 && m<10 )&&(n>2 && n<10)){
            Q2_2018 ob=new Q2_2018(m,n);
            ob.input();
            ob.display("ORIGINAL MATRIX: ");
            ob.sortMatrix();
            ob.display("MATRIX AFTER SORTING:");
        }
        else{
            System.out.print("INVALID INPUT!");
            System.exit(0);

        }
    }
}
