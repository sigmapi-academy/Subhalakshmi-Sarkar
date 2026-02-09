package FileHandling1.src;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        //Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./DataFiles/person.ser"))) {
            Person p = (Person)ois.readObject();
            System.out.println("Object has been deserialized");
            System.out.println("Age: " +p.getAge());
            System.out.println("Name: "+p.getName());
            System.out.println("Your password: "+ p.getPassword());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
