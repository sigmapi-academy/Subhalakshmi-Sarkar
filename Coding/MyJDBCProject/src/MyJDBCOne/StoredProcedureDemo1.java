package MyJDBCOne;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class StoredProcedureDemo1 {
    public static void main(String[] args) {
        String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
        String username = "sys as sysdba";
        String password = "Calcutta1983";
        Scanner sc = new Scanner(System.in);
         
        try {
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            CallableStatement cst = con.prepareCall("{call getsalary(?,?,?)}");
            System.out.println("Enter employee id: ");
            String eid = sc.next();
            cst.setString(1, eid);
            cst.registerOutParameter(2, Types.DOUBLE);
            cst.registerOutParameter(3, Types.VARCHAR);
            cst.execute();
            System.out.println("Name of employee: "+ cst.getString(3));
            System.out.println("Basic Salary: " + cst.getDouble(2));
            con.close();
            sc.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
                
    }
}
