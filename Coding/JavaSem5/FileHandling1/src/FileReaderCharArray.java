package FileHandling1.src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderCharArray {
    public static void main(String[] args) {
        FileReader fr = null;
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        fileName = sc.nextLine();
        try {
            fr = new FileReader("./DataFiles/" + fileName);
            int i;
            char buf[] = new char[100] ;
            System.out.println("The content is: \n");
            while ((i = fr.read(buf)) != -1) {
                System.out.println("Number of charcter in this line: "+i+"\n");
                System.out.print(new String(buf, 0, i));
            }
            fr.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        sc.close();
    }
}
