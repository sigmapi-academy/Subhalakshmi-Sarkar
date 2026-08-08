package MyJDBCOne;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedureFunctionDemo1 {
 public static void main(String[] args) {
        String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
        String username = "sys as sysdba";
        String password = "Calcutta1983";

        try {
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            CallableStatement cst = con.prepareCall("{?= call getAvg(?, ?)}");
            cst.setString(2, "E001");
            cst.setString(3, "E002");
            cst.registerOutParameter(1, Types.FLOAT);
            cst.execute();
            System.out.println("Average salary: "+ cst.getFloat(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
