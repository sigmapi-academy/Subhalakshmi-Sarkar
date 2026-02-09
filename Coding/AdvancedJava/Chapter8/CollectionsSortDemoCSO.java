package Chapter8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class CollectionsSortDemoCSO {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Random r = new Random();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < r.nextInt(10)+5; i++) {
            al.add(alpha.charAt(r.nextInt(26)));
        }
        System.out.println("Before sorting: " + al);
        Collections.sort(al, new MyComparator());
        System.out.println("After sorting: " + al);
    }
}
