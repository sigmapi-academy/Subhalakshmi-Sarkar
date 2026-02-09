import java.util.TreeSet;

public class TreeSetDemo{
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("A");
        t.add("a");
        t.add("L");
        t.add("Z");
        t.add("B");
        System.out.println(t);
        t.add(10);
    }
}