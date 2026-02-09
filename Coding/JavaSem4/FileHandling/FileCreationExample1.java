package FileHandling;
import java.io.*;


/**
 * Write a description of class FileCreationExample1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileCreationExample1
{
    public static void main(String args[]){
        //File object representing a file. 
        File file = new File("example.txt");
        
        //File object representing a directory. 
        File directory =  new File("Data");
        
        //File object representing a path to a file within a directory. 
        File nestedFile = new File("Data/example.txt");
        
        System.out.print("\fFile: " + file.getAbsolutePath());
        System.out.print("\nDirectory: " + directory.getAbsolutePath());
        System.out.print("\nNested files: " + nestedFile.getAbsolutePath());
    }
}