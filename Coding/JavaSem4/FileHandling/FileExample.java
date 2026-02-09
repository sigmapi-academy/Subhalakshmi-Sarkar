package FileHandling;
import java.util.*;
import java.io.*;
import java.text.*;

/**
 * Write a description of class FileExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileExample
{
    public static void main (String args []) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter file name: ");
        fileName = sc.next();
        File file = new File(fileName);
        try{
            if(file.createNewFile()){
                System.out.print("\nFile created successfully");
            }

            //Write to the File
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                writer.write("Hello, World!");
                writer.newLine();
                writer.write("this is a sample file.");
            }
            
            //Get file information
            System.out.print("\nFile Name: " + file.getName());
            System.out.print("\nAbsolute Path: " + file.getAbsolutePath());
            System.out.print("\nIs Directory: " + file.isDirectory());
            System.out.print("\nIs File: " + file.isFile());
            System.out.print("\nFile Size: " + file.length());
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.print("\nLast Modified: " + sdf.format(file.lastModified()));
            
            
        }
        catch(IOException e){}
    }
}