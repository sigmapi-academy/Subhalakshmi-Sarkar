package MyJDBCOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class OracleToMySQL {
    public static void main(String[] args) {
        // Database url
        String url = "jdbc:mysql://localhost:3306/world";

        // MySQL user name and password
        String userName = "root";
        String password = "Calcutta1983";

        String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
        String usernameOracle = "sys as sysdba";
        String passwd = "Calcutta1983";
        Scanner sc = new Scanner(System.in);
        
        // Load MySQL jdbc Driver
        try {
            // Establish the connection
            Connection con1 = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to MySQL Database successfully");
            Statement stmt1 = con1.createStatement();

            Connection con2 = DriverManager.getConnection(dbUrl, usernameOracle, passwd);
            Statement stmt2 = con2.createStatement();
            
            ResultSet rs = stmt2.executeQuery("select * from employee");

            int count = 0;
            while (rs.next()) {
                count++;
                String eid = rs.getString(1);
                String name = rs.getString(2);
                String depid = rs.getString(3);
                float basic_salary = rs.getFloat(4);
                String sqlQuery = 
                    String.format("insert into employee values ('%s','%s','%s',%.2f)", 
                        eid, name, depid, basic_salary);
                
                stmt1.executeUpdate(sqlQuery);
            }
            System.out.println("Total rows copied from Oracle to MySQL and number of records: "+ count);
            con1.close();
            con2.close();
        }
        catch(Exception e){

        }
    }
}
