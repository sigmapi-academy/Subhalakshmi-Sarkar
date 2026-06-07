package MyJDBCOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBCWithMySQL {
    public static void main(String[] args) {
        // Database url
        String url = "jdbc:mysql://localhost:3306/world";

        // MySQL user name and password
        String userName = "root";
        String password = "Calcutta1983";

        // Load MySQL jdbc Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to MySQL Database successfully");
            
            // Create the Statement
            Statement stmt = con.createStatement();

            // Create the query
            String query = "SELECT * from country";

            // get the resultset
            ResultSet rs = stmt.executeQuery(query);
            double sum = 0;
            int count = 0;
            
            // process the resultSet
            while (rs.next()) {
                String code = rs.getString("Code");
                String name = rs.getString("Name");
                double lifeExpectancy = rs.getDouble("LifeExpectancy");
                count++;
                sum += lifeExpectancy;
                System.out.println("\t"+code+"\t"+name+"\t"+lifeExpectancy);
            }
            System.out.println("\nAverage life expectency: " + sum/count);
            // close all the resources
            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
