package FileHandling;
import java.io.*;
import java.util.*;

/**
 * Write a description of class CreateFileUsinfFileClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateFileUsingFileClass
{
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        String fileName;
        System.out.print("\fEnter file name: ");
        fileName = sc.next();
        try{
            File file = new File("./Data/" + fileName);
            if(file.createNewFile()){
                System.out.print("\nFile created: " + 
                    file.getAbsolutePath());
            }    
            else{
                System.out.print("\nFile already exists.");
            }
        }
        catch(IOException e){
            System.err.print("\nAn Error Occurred!");
            e.printStackTrace();
        }
    }
}