package FileHandling;
import java.util.*;
import java.io.*;

/**
 * Write a description of class WritingToFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WritingToFile
{
    public static void main(String args[]){
        //approach-1 using File object
        String path, fileName;
        Scanner sc = new Scanner(System.in);
        path = "./Data/";
        System.out.print("\fEnter filename: ");
        fileName = sc.nextLine();
        File file;
        FileWriter fw = null;
        try{
            file = new File(path + fileName);
            //fw = new FileWriter(file); //not append mode
            fw = new FileWriter(file, true); //append mode 
            while(true){
                String line = sc.nextLine()+"\n";
                fw.write(line);
                System.out.print("\nFor more lines press 'Y/n': ");
                line = sc.nextLine();
                if(line.equalsIgnoreCase("n")){
                    break;
                }
            }
        }
        catch(IOException e){
            System.err.print("\nFile not created!");
        }
        finally{
            try
            {
                fw.close();
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
            sc.close();
            
        }
    }
}