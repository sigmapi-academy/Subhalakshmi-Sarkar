package FileHandling1.BinaryFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BinaryFileWriter {
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = sc.nextLine();
        try(FileOutputStream fos = new FileOutputStream("./DataFiles/"+fileName)){
            fos.write(100);
            fos.write(new byte[]{65, 66, 67});
            sc.close();
        }
        catch(FileNotFoundException e){}
        catch(IOException e){}

    }
}
