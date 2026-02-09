package FileHandling1.src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExample1 {
    
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        fileName = sc.next();
        try{
            File file = new File("./DataFiles/"+fileName);
            FileWriter fw = new FileWriter(file, true);
            fw.write("Hello World!\n");
            fw.close();
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

