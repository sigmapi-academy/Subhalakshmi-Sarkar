package MyJDBCOne;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DateInsertDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = ConnectionObject.getConnection();
        if (con == null) {
            System.err.println("Could not connect to Oracle. Check that the Oracle JDBC driver, database service, and credentials are available.");
            sc.close();
            return;
        }
        String sql = "INSERT INTO ATTENDANCE VALUES(?,?)";
        try (con; PreparedStatement pst = con.prepareStatement(sql)) {
            System.out.println("Enter employee id: ");
            String empid = sc.next();
            long l = new java.util.Date().getTime();
            Date sdate = new Date(l);
            pst.setDate(1, sdate);
            pst.setString(2, empid);

            pst.executeUpdate();
            System.out.println("Record inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
