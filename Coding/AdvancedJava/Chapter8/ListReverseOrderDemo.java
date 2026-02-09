package Chapter8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListReverseOrderDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Random r = new Random();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < r.nextInt(10)+5; i++) {
            al.add(alpha.charAt(r.nextInt(26)));
        }
        System.out.println("Before sorting: " + al);
        Collections.sort(al);
        System.out.println("After sorting: " + al);
        Collections.reverse(al);
        System.out.println("Reversed: " + al);
    }
}
