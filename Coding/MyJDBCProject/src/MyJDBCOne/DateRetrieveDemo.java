package MyJDBCOne;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class DateRetrieveDemo {
    public static void main(String[] args) throws SQLException {
        Connection con = ConnectionObject.getConnection();

        String sql = "SELECT * FROM ATTENDANCE";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        while (rs.next()) {
            Date adt = rs.getDate(1);
            String s = sdf.format(adt);
            String eid = rs.getString(2);
            System.out.println("Employee id: "+eid);
            System.out.println("Attendance date: " + s );
        }
        con.close();
    }
}
