package MyJDBCOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NthHighestSalaryDemo {
    public static void main(String[] args) {
        String dbUrl = "jdbc:oracle:thin:@//localhost:1521/FREE";
        String username = "sys as sysdba";
        String password = "Calcutta1983";
        Scanner sc = new Scanner(System.in);
        
        try {
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = con.createStatement();
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            String query = "select * from "+
            "(select emp_id,name,dept_id,basic_salary,"+
            " rank() over (order by basic_salary desc)" +
            "ranking from employee) where ranking =" +n;
            ResultSet rs =  stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1)+"\t"+
                rs.getString(2)+"\t"+rs.getString(3)+
                "\t"+rs.getDouble(4));
            }
            con.close();
            sc.close();
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}
