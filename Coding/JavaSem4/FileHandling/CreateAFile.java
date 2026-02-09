package FileHandling;
import java.util.*;
import java.io.*;

/**
 * Write a description of class CreateAFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateAFile
{
    public static void main(String args[]){
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter File Name: ");
        fileName = sc.next();
        String Path = "./Data/";
        File file = new File(Path+fileName);
        
        try{
            if( file.createNewFile()){
                System.out.print("\nFile created successfully.");
            }
            else{
                System.out.print("\nFile already exists.");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}