import java.util.Random;
import java.util.Vector;

public class VectorOper {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Initial capacity: "+v.capacity());
        int i;
        Random r = new Random();
        for(i = 0; i < 10; i++){
            v.addElement(r.nextInt(10, 100));
        }
        System.out.println("Initial Capacity: "+v.capacity());
        v.addElement("Shiv");
        System.out.println("Initial Capacity: "+v.capacity());
        System.out.println(v);
    }
}
