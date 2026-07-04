package MyJDBCOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
        String username = "sys as sysdba";
        String password = "Calcutta1983";
        Scanner sc = new Scanner(System.in);
        String query = "insert into employee values(?,?,?,?)";
        Connection con;
        try {
            con = DriverManager.getConnection(dbUrl, username, password);
            PreparedStatement ps = con.prepareStatement(query);
            int count = 0;
            while (true) {
                String empid, name, dep_id;
                float salary;
                System.out.println("Enter employee id: ");
                empid = sc.next();
                sc.nextLine();
                System.out.println("Enter name: ");
                name = sc.nextLine();
                System.out.println("Enter department id: ");
                dep_id = sc.next();
                System.out.println("Enter salary: \u20B9 ");
                salary = sc.nextFloat();

                ps.setString(1, empid);
                ps.setString(2, name);
                ps.setString(3, dep_id);
                ps.setFloat(4, salary);

                count += ps.executeUpdate();
                System.out.println("Record inserted successfully");
                System.out.println("Do you want to insert one more recored, press y/Y: ");
                char option = sc.next().toLowerCase().charAt(0);
                if (option == 'y'){
                    continue;
                }
                else{
                    System.out.println("Number of records inserted: "+ count);
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
