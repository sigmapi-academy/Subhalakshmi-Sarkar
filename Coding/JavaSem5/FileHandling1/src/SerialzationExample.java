package FileHandling1.src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialzationExample {
    public static void main(String[] args) {
        Person p = new Person("Harry", 40, "mypassword");
        
        try(ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("./DataFiles/person.ser")
        )){
            oos.writeObject(p);
            System.out.println("Object has been serialized");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
