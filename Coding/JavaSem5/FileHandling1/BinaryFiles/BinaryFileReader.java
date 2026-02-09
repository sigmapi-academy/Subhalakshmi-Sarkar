package FileHandling1.BinaryFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BinaryFileReader {
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = sc.nextLine();
        sc.close();
        try (FileInputStream fis = new FileInputStream("./DataFiles/"+fileName)) {
            int data;
            while((data = fis.read())!=-1){
                System.out.print(data);
            }
        } 
        catch(FileNotFoundException f){}
        catch(IOException ioe){}
    }
}
