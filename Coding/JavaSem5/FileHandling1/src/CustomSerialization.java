package FileHandling1.src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerialization {
    public static void main(String[] args) {
        //Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("./DataFiles/account.ser") )) {

            Account ob = new Account("user123", "mypassword");
            oos.writeObject(ob);
            
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        //Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("./DataFiles/account.ser")) ) {
                Account ob = (Account)ois.readObject();
            System.out.println("Deserialized Account");
            System.out.println(ob);
        } catch (IOException | ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
