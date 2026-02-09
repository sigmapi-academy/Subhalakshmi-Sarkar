import java.util.TreeSet;

import Chapter6.MyComparator;

public class IntegerTreeSet {
    public static void main(String[] args) {
        // TreeSet<Integer> t = new TreeSet<Integer>();
        TreeSet t = new TreeSet(new MyComparator());
        t.add(19);
        t.add(-1);
        t.add(10);
        t.add(7);
        t.add(71);
        t.add(45);

        System.out.println(t);
    }
}
