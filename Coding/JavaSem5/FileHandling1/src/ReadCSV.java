package FileHandling1.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "./FileHandling1/CSVFiles/";
        String line;
        String delimiter=",";
        System.out.println("Enter your csv file name: ");
        String fileName = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath+fileName))) {
            //read the header 
            String header = br.readLine();
            System.out.println("header: "+header);
            //Read and process each line of the CSV
            while((line = br.readLine())!= null){
                //Split each line into fields using delimiter
                String[] fields = line.split(delimiter);
                //Accessing individual fields
                String eCode = fields[0];
                String eName = fields[1];
                String eAge = fields[2];
                String eCity = fields[3];
                String eSalary = fields[4];
                System.out.println(
                    "\nEmployee code:" + eCode +
                    "\nName: " + eName +
                    "\nAge: " + eAge +
                    "\nCity: " + eCity +
                    "\nSalary: " + eSalary
                );
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }
}
