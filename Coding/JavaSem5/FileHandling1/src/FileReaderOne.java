package FileHandling1.src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderOne {
    public static void main(String[] args) {
        FileReader fr = null;
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        fileName = sc.nextLine();
        try
        {
            fr = new FileReader("./DataFiles/"+fileName);
            int i;
            System.out.println("The content is: \n");
            while( (i = fr.read()) != -1 ){
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(FileNotFoundException e){}
        catch(IOException e){}
        sc.close();
    }
}
