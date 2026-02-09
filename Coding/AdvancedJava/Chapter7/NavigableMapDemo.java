import java.util.*;

public class NavigableMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> t = new TreeMap<String, String>();
        t.put("c", "Cat");
        t.put("b", "Banana");
        t.put("d", "Dog");
        t.put("a", "Apple");
        t.put("g", "Gun");
        System.out.println(t);
        System.out.println(t.ceilingKey("c"));
        System.out.println(t.higherKey("c"));
        System.out.println(t.floorKey("e"));
        System.out.println(t.lowerKey("e"));
        System.out.println(t.lowerKey("d"));
        System.out.println(t.pollFirstEntry());
        System.out.println(t.pollLastEntry());
        System.out.println(t.descendingMap());
        System.out.println(t);
    }
}
