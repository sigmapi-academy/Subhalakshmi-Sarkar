package FileHandling1.BinaryFiles;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class BinaryFileReaderDIS {
    public static void main(String[] args) {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = sc.nextLine();
        sc.close();
        try (DataInputStream dis = new DataInputStream(new
            FileInputStream("./DataFiles/"+fileName))) {
            int ivalue = dis.readInt();
            double dvalue = dis.readDouble();
            boolean bvalue = dis.readBoolean();
            String svalue = dis.readUTF();
            System.out.println("\nInteger: "+ivalue+
            "\nDouble value: "+dvalue+
            "\nBoolean value: "+bvalue+
            "\nString value: "+svalue);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
