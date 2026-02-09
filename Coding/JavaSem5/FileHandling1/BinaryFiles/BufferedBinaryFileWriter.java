package FileHandling1.BinaryFiles;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedBinaryFileWriter {
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = sc.nextLine();
        sc.close();
        try (BufferedOutputStream bos = new 
        BufferedOutputStream(new FileOutputStream("./DataFiles/" + fileName))) {
            bos.write(5672);
            bos.write(new byte[]{65,66,67,68});
        } catch (FileNotFoundException e) {
            // TODO: handle exception
        }
        catch(IOException e){}
    }
}
