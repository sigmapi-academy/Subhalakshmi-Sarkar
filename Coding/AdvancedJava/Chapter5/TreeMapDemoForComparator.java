package Chapter5;

import java.util.TreeMap;

public class TreeMapDemoForComparator {
    public static void main(String[] args) {
        TreeMap t = new TreeMap(new MyComparator());
        t.put(100, "Ajit");
        t.put("Sachin", "Tendulkar");
        t.put(99.96, "Don Bradman");
        t.put(234678855467L, "big number");

        System.out.println(t);
    }
}
