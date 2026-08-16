package MyJDBCOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionObject {
    private static String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
    private static String username = "sys as sysdba";
    private static String password = "Calcutta1983";

    @SuppressWarnings("finally")
    public static Connection getConnection(){
        Connection con=null;
        try {
            con = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            return con;
        }
    } 
}
