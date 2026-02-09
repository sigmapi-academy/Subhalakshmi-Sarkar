package ExceptionHandling;
import java.io.*;


/**
 * Write a description of class EHExample5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EHExample5
{ 
    public static void anyFun() throws IOException, ArithmeticException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int x;
        float f;
        String wrd;
        System.out.print("\fEnter the value of x: ");
        x = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of f: ");
        f = Float.parseFloat(br.readLine());
        System.out.print("\nEnter any word: ");
        wrd = br.readLine();
        System.out.print("\nx : " + x);
        System.out.print("\nf : " + f);
        System.out.print("\nwrd : " + wrd);
        System.out.print("\nresult: " + (x/0));
    }
    
    public static void main(String args[]){
        
        try
        {
            anyFun();
        }
        catch(ArithmeticException ae){
            System.err.print("Cannot divide by 0\n");
        }
        catch(NumberFormatException nfe){
            System.err.print("\nDifferent symbol other than digits is entered");
        }
        catch (IOException ioe)
        {
            System.err.print("Data input error!");
        }
    }
}