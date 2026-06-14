package MyJDBCOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRows {
    public static void main(String[] args) {
        String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
        String username = "sys as sysdba";
        String password = "Calcutta1983";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        try {
            while (true) {
                System.out.println("Enter employee id: ");
                String eid = sc.next();
                sc.nextLine();
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter Department: ");
                String dept = sc.next();
                System.out.println("Enter basic salary: ");
                float bs = sc.nextFloat();

                Connection con = DriverManager.getConnection(dbUrl, username, password);
                Statement stmt = con.createStatement();
                String query = String.format(
                        "INSERT INTO EMPLOYEE VALUES('%s', '%s', '%s', %f)",
                        eid, name, dept, bs);
                int x = stmt.executeUpdate(query);
                count += x;
                System.out.println("\n" + x + " row added.");
                System.out.println("Do you want to insert one more reciord[yes/no]: ");
                sc.nextLine();
                String option = sc.next();
                if (option.equalsIgnoreCase("No")) {
                    System.out.println("\nNumber of rows stored in the table: " + count);
                    con.close();
                    sc.close();
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Connection not established");
        }
    }
}
