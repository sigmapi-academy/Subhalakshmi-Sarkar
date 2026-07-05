package MyJDBCOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLInjection {
    public static void main(String[] args) {
        String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
        String username = "sys as sysdba";
        String password = "Calcutta1983";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String user = sc.nextLine();
        System.out.println("Enter password: ");
        String pass = sc.nextLine();
        try {
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement st = con.createStatement();
            // String sql = "SELECT * FROM USERS WHERE username='"+user+
            // "' And password = '"+pass+"'";
            String sql = "SELECT * FROM USERS WHERE username='"+user+
            "' OR '1' = '1'";
            System.out.println(sql);
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            if(rs.next()){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Invalid user name or");
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }


    }
}
