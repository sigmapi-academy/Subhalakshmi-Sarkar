package FileHandling1.src;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException{
        oos.defaultWriteObject(); //Write non-transient fields
        String encryptedPassword = "123"+password; //simple encryption
        oos.writeObject(encryptedPassword);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
        ois.defaultReadObject(); //read non-transient fields
        String encryptedPassword = (String)ois.readObject();
        this.password = encryptedPassword.substring(3); //simple decryption
    }

    @Override
    public String toString() {
        return "username=" + username + 
        "\npassword="+password;
    }
}
