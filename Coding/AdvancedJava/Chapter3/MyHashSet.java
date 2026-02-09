// import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyHashSet {
    public static void main(String[] args) {
        // HashSet h = new HashSet();
        LinkedHashSet h = new LinkedHashSet();
        System.out.println("Linked Hash Set: ");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(10);
        h.add("M");
        h.add("E");
        System.out.println(h.add("Z"));
        System.out.println(h);
    }
}
