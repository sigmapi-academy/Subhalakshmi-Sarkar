package MyJDBCOne;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CLOBAndBLOBDemo {
    public static void main(String[] args) {
        Connection con = ConnectionObject.getConnection();

        String sqlQuery="insert into student_document values(?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            ps.setInt(1, 101);
            ps.setString(2, "Subhalakshmi");
            File f = new File("ImageFiles/Subha.jpg");
            FileInputStream fis = new FileInputStream(f);
            ps.setBinaryStream(3, fis);
            File ft = new File("TextFiles/gracefullgirl.txt");
            FileReader fr = new FileReader(ft);
            ps.setCharacterStream(4, fr);
            int updateCount = ps.executeUpdate();
            if(updateCount == 1){
                System.out.println("Record inserted");
            }
            else{
                System.out.println("Record not inserted");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
        e.printStackTrace();
        }
        
    }
}
