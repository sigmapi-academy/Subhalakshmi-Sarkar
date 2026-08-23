package MyJDBCOne;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionalBatchDemo {
    public static void main(String[] args) {
        Connection con = ConnectionObject.getConnection();

        String sql = "INSERT INTO employee " +
                "(emp_id, name, dept_id, basic_salary)" +
                "VALUES(?,?,?,?)";

        try (PreparedStatement pst = con.prepareStatement(sql)) {
            try {
                con.setAutoCommit(false);
                pst.setString(1, "E019");
                pst.setString(2, "Frank");
                pst.setString(3, "D003");
                pst.setInt(4, 67800);
                pst.addBatch();

                pst.setString(1, "E020");
                pst.setString(2, "Davis");
                pst.setString(3, "D004");
                pst.setInt(4, 62000);
                pst.addBatch();

                pst.setString(1, "E021");
                pst.setString(2, "Anthony");
                pst.setString(3, "IT");
                pst.setInt(4, 67900);
                pst.addBatch();

                pst.setString(1, "E022");
                pst.setString(2, "Issac");
                pst.setString(3, "Research");
                pst.setInt(4, 167900);
                pst.addBatch();

                int[] result = pst.executeBatch();
                for (int r : result) {
                    System.out.println(r);
                }
                con.commit();
                System.out.println("Batch committed Successfully.");

            } catch (SQLException e) {
                con.rollback();
                System.out.println("Batch failed. Transaction rolled back.");
                throw e; //Chaining of catch exception
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println("Check the batch query.");
        }
    }
}
