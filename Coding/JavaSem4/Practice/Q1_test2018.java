package Practice;
import java.util.*;

/**
 * Write a description of class Q1_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1_test2018
{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("\fEnter an even number:");
        n=sc.nextInt();
        if(n%2==0){
            Q12018 ob=new Q12018(n);
            System.out.println("Prime pairs are:");
            ob.get_pair();
        }
    }
}
