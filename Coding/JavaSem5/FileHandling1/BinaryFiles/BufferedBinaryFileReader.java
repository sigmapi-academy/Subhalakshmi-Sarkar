package FileHandling1.BinaryFiles;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BufferedBinaryFileReader {
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = sc.nextLine();
        sc.close();
        try (BufferedInputStream bis = new BufferedInputStream(
            new FileInputStream("./DataFiles/"+fileName) )) {
            int data;
            while((data = bis.read()) != -1){
                System.out.println((char)data);
            }
        } 
        catch(FileNotFoundException e){}
        catch(IOException e){}
    }
}
