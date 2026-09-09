package MyJDBCOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;


public class SQLDateTimeInsertExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_attendance";
        String username = "root";
        String password = "Calcutta1983";

        try (Connection con = DriverManager.getConnection(url, username, password)){
            System.out.println("Database connected successfully");
            String SQL = "INSERT INTO test_datetime VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            
            Date utilDate = new Date();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            java.sql.Time sqlTime = new java.sql.Time(utilDate.getTime());
            java.sql.Timestamp sqlTS = new java.sql.Timestamp(utilDate.getTime());

            ps.setDate(1, sqlDate);
            ps.setTime(2, sqlTime);
            ps.setTimestamp(3, sqlTS);

            ps.setObject(4, utilDate);
            ps.setObject(5, utilDate);
            ps.setObject(6, utilDate);

            int r = ps.executeUpdate();
            System.out.println("Number of rows inserted: "+ r);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
