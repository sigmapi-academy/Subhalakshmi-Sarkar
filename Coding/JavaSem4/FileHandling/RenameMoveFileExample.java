package FileHandling;
import java.io.*;
import java.util.*;


/**
 * Write a description of class RenameMoveFileExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameMoveFileExample
{
    public static void main(String args[]){
        String fileName1, fileName2;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter file name to rename: ");
        fileName1 = sc.nextLine();
        System.out.print("Enter new file name: ");
        fileName2 = sc.nextLine();
        
        File oldFile = new File(fileName1);
        File newFile = new File(fileName2);
        
        if(oldFile.exists()){
            if(oldFile.renameTo(newFile)){
                System.out.print("\nFile rename/moved successfully.");
            }
            else{
                System.out.print("\nFailed to rename/move file.");
            }
        }
        else{
            System.out.print("\nFile does not exist");
        }
    }
}