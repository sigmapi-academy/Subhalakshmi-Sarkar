package Chapter5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties p = new Properties();
        try (FileInputStream fis = new FileInputStream("Chapter5/users.properties");
        FileOutputStream fos = new FileOutputStream("Chapter5/users.properties", true)){
            p.load(fis);
            String str  = p.getProperty("Subhalakshmi");
            System.out.println("\nvalue: "+str);

            String uname = JOptionPane.showInputDialog("Enter user name: ");
            String pwd = JOptionPane.showInputDialog("Enter your password: ");
            p.setProperty(uname, pwd);
            p.store(fos, "\n"+uname+"="+pwd);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
