package MyJDBCOne;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

public class StoredProcedureDemo2 {
    public static void main(String[] args) {
        String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
        String username = "sys as sysdba";
        String password = "Calcutta1983";

        Connection con;
        try {
            con = DriverManager.getConnection(dbUrl, username, password);
            CallableStatement cst = con.prepareCall("{call getallempinfo(?)}");
            cst.registerOutParameter(1, OracleTypes.CURSOR);
            cst.execute();
            ResultSet rs = (ResultSet) cst.getObject(1);
            boolean flag = false;
            System.out.println("Emp_id\tName\t\tdept_id\tbasic_salary");
            System.out.println("---------------------------------------------");
            while (rs.next()) {
                flag = true;
                System.out.println(rs.getString(1) + "\t" +
                        rs.getString(2) + "\t" +
                        rs.getString(3) + "\t\t" +
                        rs.getFloat(4));
            }
            if (!flag) {
                System.out.println("No records available");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
