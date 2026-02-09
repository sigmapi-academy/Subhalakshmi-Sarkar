package ExceptionHandling;
import java.io.*;

/**
 * Write a description of class EHExample4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EHExample4
{
    public static void main(String args[]){
        try{
            method();
        }catch(IOException e){
            System.out.print("\nIOException handled");
        }
    }

    /**
     * @throws
     */
    
    public static void method() throws IOException
    {
        throw new IOException("Device Error");
    }
}