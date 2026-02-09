package Practice;
import java.util.*;


/**
 * Write a description of class Q3_test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3_test
{
    public static void main(String args[]){
        String n;
        Scanner sc=new Scanner(System.in);
        System.out.print("\fEnter a sentence in upper case:");
        n=sc.nextLine();
        Q3 ob=new Q3(n);
        boolean c=ob.check();
        if(c==false){
            System.out.println("INVALID INPUT");
            System.exit(1);
        }
        else{
            System.out.println(n);
            System.out.print("\n");
            ob.convert(n);
        }    
    }
}
