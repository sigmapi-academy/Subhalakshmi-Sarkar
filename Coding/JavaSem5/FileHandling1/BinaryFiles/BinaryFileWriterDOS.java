package FileHandling1.BinaryFiles;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BinaryFileWriterDOS {
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = sc.nextLine();
        sc.close();
        try(DataOutputStream dos = new 
        DataOutputStream(new FileOutputStream("./DataFiles/"+fileName))){
            dos.writeInt(123);
            dos.writeDouble(45.67);
            dos.writeBoolean(false);
            dos.writeUTF("Java programming is fun");
        }
        catch(FileNotFoundException e){}
        catch(IOException e){}
    }
    
}
