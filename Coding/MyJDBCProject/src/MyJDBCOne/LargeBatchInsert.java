package MyJDBCOne;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LargeBatchInsert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = ConnectionObject.getConnection();

        String sql = "INSERT INTO employee " +
                "(emp_id, name, dept_id, basic_salary)" +
                "VALUES(?,?,?,?)";
        int batchSize = 100;
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            try {
                con.setAutoCommit(false);
                for (int i = 1; i <= 1000; i++) {
                    System.out.println("Enter employee id: ");
                    pst.setString(1, sc.next());
                    System.out.println("Enter employee name: ");
                    pst.setString(2, sc.nextLine());
                    System.out.println("Enter department id: ");
                    pst.setString(3, sc.next());
                    System.out.println("Enter basic salary: ");
                    pst.setInt(4, sc.nextInt());
                    pst.addBatch();

                    if(i % batchSize == 0){
                        pst.executeBatch();
                        pst.clearBatch();
                        System.out.println(i + " rescord processed.");
                    }

                }
                con.commit();
                System.out.println("Batch committed Successfully.");

            } catch (SQLException e) {
                con.rollback();
                System.out.println("Batch failed. Transaction rolled back.");
                throw e; // Chaining of catch exception
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println("Check the batch query.");
        }
    }

}
