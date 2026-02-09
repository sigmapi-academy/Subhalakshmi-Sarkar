package Chapter7;
import java.util.*;

public class NavigableSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(2000);
        t.add(4000);
        t.add(5000);
        t.add(3000);
        t.add(1000);
        t.add(1500);
        System.out.println(t);
        System.out.println(t.ceiling(1750));
        System.out.println(t.higher(2000));
        System.out.println(t.floor(3000));
        System.err.println(t.lower(3000));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t.descendingSet());
        System.out.println(t);
    }
}
