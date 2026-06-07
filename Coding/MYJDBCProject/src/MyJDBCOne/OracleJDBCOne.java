package MyJDBCOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBCOne {
    public static void main(String[] args) {
        String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
        String username = "sys as sysdba";
        String password = "Calcutta1983";

        try {
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM EMPLOYEE";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("------Employee details-------");
                System.out.println(rs.getString("EMP_ID"));
                System.out.println("Name: "+rs.getString("NAME"));
                System.out.println("Department: "+rs.getString("DEPT_ID"));
                System.out.println("Basic salary: " + rs.getFloat("BASIC_SALARY"));
                System.out.println("----------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Connection not established");
        }
    }
}
