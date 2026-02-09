package Chapter5;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap h = new WeakHashMap();
        Temp t = new Temp();
        h.put(t, "Shiv");
        t = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(h);
    }
}
