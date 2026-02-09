import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.RandomAccess;

public class ArrayListOne {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList al = new ArrayList<>();
        al.add("A");
        al.add(10);
        al.add("B");

        for(int i = 0; i < 5; i++){
            al.add(r.nextInt(10, 100));
        }

        System.out.println(al);

        al.remove(2); 
        System.out.println(al);
        al.add(2, 32.54);
        al.add(5, "Ellis");
        System.out.println(al);

        System.out.println(al instanceof Serializable);
        System.out.println(al instanceof Cloneable);
        System.out.println(al instanceof RandomAccess);

        LinkedList ll = new LinkedList();
        System.out.println(ll instanceof RandomAccess); //false
        System.out.println(ll instanceof Serializable); //true
        System.out.println(ll instanceof Cloneable); //true
    }
}
