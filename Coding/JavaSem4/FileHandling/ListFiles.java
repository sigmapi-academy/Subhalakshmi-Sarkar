package FileHandling;
import java.io.*;
import java.util.*;
import java.text.*;


/**
 * Write a description of class ListFiles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListFiles
{
    public static void main(String args[]){
        String directoryName;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter directory name: ");
        directoryName = sc.next();
        File directory = new File(directoryName);
        if(directory.exists() && directory.isDirectory()){
            //String[] fileList = directory.list();
            File[] fileList = directory.listFiles();
            if(fileList != null){
                //for(String fileName : fileList){
                for(File fileName : fileList){
                    System.out.print("\n" + fileName.getName());
                    System.out.print("\t" + fileName.getAbsolutePath());
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                    System.out.print("\t"+sdf.format(fileName.lastModified()));
                    System.out.print("\t" + fileName.isDirectory());
                    System.out.print("\t" + fileName.isFile());
                    System.out.print("\t" + fileName.length() + " bytes");
                }
            }
            else{
                System.out.print("\nThe directory is empty.");
            }
        }
        else{
            System.out.print("\nDirectory does not exist.");
        }
    }
}