package FileHandling1.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteCSV {
    public static void main(String[] args) {
        String path = "./FileHandling1/CSVFiles/";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter csv file name: ");
        String fileName = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + fileName, true))) {
            while (true) {
                bw.newLine();
                System.out.println("Enter employee id: ");
                String eid = sc.nextLine();
                System.out.println("Enter name: ");
                String nm = sc.nextLine();
                System.out.println("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter City: ");
                String city = sc.nextLine();
                System.out.println("Enter salary: ");
                double salary = sc.nextDouble();

                StringBuilder sb = new StringBuilder();
                sb.append(eid);
                sb.append(",");
                sb.append(nm);
                sb.append(",");
                sb.append(age);
                sb.append(",");
                sb.append(city);
                sb.append(",");
                sb.append(salary);
                
                bw.write(sb.toString()); //adding new record to the file.
                
                System.out.println("Press y/n for more records: ");
                String ch = sc.next(); sc.nextLine();
                if(ch.equalsIgnoreCase("n")){
                    break;
                }
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
