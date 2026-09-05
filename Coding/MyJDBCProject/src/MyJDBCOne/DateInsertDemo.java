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
        String sql = "INSERT INTO ATTENDANCE VALUES(?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
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
