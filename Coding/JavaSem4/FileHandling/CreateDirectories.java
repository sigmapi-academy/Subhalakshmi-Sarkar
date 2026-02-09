package FileHandling;
import java.util.*;
import java.io.*;


/**
 * Write a description of class CreateMultileDirectories here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreateDirectories
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String dirName;
        System.out.print("\fEnter your directory name:");
        dirName = sc.next();
        File directory = new File(dirName);
        if(directory.mkdirs()){
            System.out.print("\nDirectories created successfully.");
        }
        else{
            System.out.print("\nFailed to create directory or directory already exists.");
        }
    }
}