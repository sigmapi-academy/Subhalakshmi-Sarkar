package Chapter5;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDiff {
    public static void main(String[] args) {
        IdentityHashMap m = new IdentityHashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        m.put(i1, "Pawan");
        m.put(i2, "Kalyan");
        System.out.println(m);
    }
}
