package FileHandling;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Name
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String nm, path="";
        int i;
        System.out.print("\nEnter your name: ");
        nm = sc.nextLine();
        File f[] = new File[nm.length()];
        Scanner readFile[] = new Scanner[nm.length()];
        for(i = 0; i < nm.length(); i++){
            try{
                f[i] = new File(path+nm.charAt(i));
                readFile[i] = new Scanner(f[i]);
            }
            catch(FileNotFoundException fnfe){

            }
        }

    }
}