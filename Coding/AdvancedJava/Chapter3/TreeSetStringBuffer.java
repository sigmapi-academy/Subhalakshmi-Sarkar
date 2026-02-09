import java.util.TreeSet;

public class TreeSetStringBuffer {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("a"));
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("B"));
        System.out.println(t);
    }
}
