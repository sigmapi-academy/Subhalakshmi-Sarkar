package Chapter5;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap m = new TreeMap<>();
        m.put(100, "Aman");
        m.put(87, "Naman");
        m.put(112, "Aditya");
        m.put(95,"Anchit");
        m.put(98, "Sanjay");
        m.put(20,"Subhalakshmi");
        m.put(170, null);
        m.put(130, null);
        System.out.println(m);
        m.put("Varun", "Arun");
    }
}
