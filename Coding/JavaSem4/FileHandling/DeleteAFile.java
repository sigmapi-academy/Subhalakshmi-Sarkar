package FileHandling;
import java.util.*;
import java.io.*;


/**
 * Write a description of class DeleteAFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeleteAFile
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fileName;
        System.out.print("\fEnter file name: ");
        fileName = sc.nextLine();
        //here we are using relative addressing
        //the below statement is accessing the current directory or folder
        //File file = new File("FileHandling/"+fileName);
        //the belo
        File file = new File("./Data/"+fileName);
        if(file.delete()){
            System.out.print("\nFile deleted successfully.");
        }
        else{
            System.out.print("\nFile does not exists.");
        }
    }
}
