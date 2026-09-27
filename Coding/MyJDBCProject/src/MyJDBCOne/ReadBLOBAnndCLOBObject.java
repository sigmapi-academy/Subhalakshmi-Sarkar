package MyJDBCOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;

public class ReadBLOBAnndCLOBObject {
    public static void main(String[] args) {
        // Connection con = ConnectionObject.getConnection();
        Connection con = ConnectionObject.getConnection();
        String sqlQuery="Select * FROM student_document";

        try {
            PreparedStatement ps = con.prepareStatement(sqlQuery);
            //ps.setInt(1, 101);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                System.out.println("No student document found.");
                return;
            }

            int rollNo = rs.getInt("student_id");
            String nm = rs.getString("student_name");
            InputStream ist = rs.getBinaryStream("photo");
            OutputStream os = new FileOutputStream("TextFiles/retrieved_student.jpg");

            byte[] buffer = new byte[4096];

            int bytesRead;
            while((bytesRead=ist.read(buffer))!=-1){
                os.write(buffer, 0, bytesRead);
            }
            ist.close();
            os.close();


            Reader reader = rs.getCharacterStream("biography");
            char[] charBuffer = new char[4096];
            int charsRead;
            while((charsRead = reader.read(charBuffer))!= -1){
                System.out.print(new String(charBuffer, 0, charsRead));
            }
            reader.close();

            //System.out.println("Roll number: " + rollNo);
            //System.out.println("Name: " + nm);

            
            BufferedImage img = ImageIO.read(new File("TextFiles/retrieved_student.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JFrame frame = new JFrame("Retrieved image");
            JLabel label2 = new JLabel(nm);
            JLabel label3 = new JLabel(Integer.toString(rollNo));
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 1));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            panel.add(label);
            panel.add(label2);
            panel.add(label3);
            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
        catch(SQLException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
}
