package Chapter5;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Key, String> t = new Hashtable<Key, String>(25);
        t.put(new Key(5), "A");
        t.put(new Key(2), "B");
        t.put(new Key(25), "C");
        t.put(new Key(52), "D");
        t.put(new Key(16), "E");
        t.put(new Key(15), "F");
        t.put(new Key(12), "G");

        System.out.println(t);

        Key k1 = new Key(15);
        System.out.println("\n"+t.get(k1));
        
    }
}
