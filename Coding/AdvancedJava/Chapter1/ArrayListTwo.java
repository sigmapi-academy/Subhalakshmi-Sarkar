import java.util.ArrayList;
import java.util.Vector;

public class ArrayListTwo {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        System.out.println("default arraylist size: "+al.size());
        for(int i = 1; i <= 10; i++){
            al.add(i);
        }
        System.out.println("Arraylist: " + al);
        al.add(11);
        System.out.println("\nNew size of array-list: " + al.size());
        System.out.println("\nlength of array: "+(al.toArray().length));
    }
}