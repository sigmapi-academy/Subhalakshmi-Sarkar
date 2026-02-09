package FileHandling1.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterExample {
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        fileName = sc.next();

        File file = new File("./DataFiles/"+fileName);
        try{
            PrintWriter pw = new PrintWriter(file);
            pw.println("My name is Satyender");
            pw.println("I am teaching Subhalakshmi");
            pw.close();
            sc.close();
        }catch(FileNotFoundException e){
            System.err.println("File not found!");
        }
    }
}
