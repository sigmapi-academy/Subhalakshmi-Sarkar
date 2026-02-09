package Chapter6;

import java.util.Comparator;

public class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String st1 = (String)o1;
        String st2 = (String)o2;
        return st2.compareTo(st1);
    }
}
