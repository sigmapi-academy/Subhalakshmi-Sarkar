package MyJDBCOne;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    Connection con = ConnectionObject.getConnection();

    public static void main(String[] args) {
        App ap = new App();
        // ap.batchUpdateUsingStatemet();
        ap.batchUpdateUsingPreparedStatement();
    }

    public void batchUpdateUsingStatemet(){
        int result[] = null;
        try {
            Statement stmt = con.createStatement();
            con.setAutoCommit(false);
            String SQL = "UPDATE employee "+ 
            "SET basic_salary = basic_salary + basic_salary*0.1 "+
            "WHERE basic_salary <= 50000 ";
            stmt.addBatch(SQL);
            result = stmt.executeBatch();
            con.commit();
        } catch (SQLException e) {
    
            e.printStackTrace();
        }
        finally{
            if(result!=null){
                for (int r: result) {
                    System.out.println(r);
                }
            }
        }
    }

    public void batchUpdateUsingPreparedStatement(){
        int result[] = null;
        try {
            String SQL = "INSERT INTO employee "+
            "(emp_id, name, dept_id, basic_salary  )"+
            "VALUES(?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(SQL);
            con.setAutoCommit(false);
            //employee - 1 
            stmt.setString(1, "E017");
            stmt.setString(2, "Tamim");
            stmt.setString(3, "IT");
            stmt.setInt(4, 45900);
            stmt.addBatch();
            //employee - 2 
            stmt.setString(1, "E018");
            stmt.setString(2, "Rishi");
            stmt.setString(3, "D001");
            stmt.setInt(4, 35900);
            stmt.addBatch();
            //employee - 3
            stmt.setString(1, "E018");
            stmt.setString(2, "Rashi");
            stmt.setString(3, "IT");
            stmt.setInt(4, 59900);
            stmt.addBatch();
            result = stmt.executeBatch();
            con.commit();
        } catch (SQLException e) {
    
            e.printStackTrace();
        }
        finally{
            if(result!=null){
                for (int r: result) {
                    System.out.println(r);
                }
            }
        }
    }
}
