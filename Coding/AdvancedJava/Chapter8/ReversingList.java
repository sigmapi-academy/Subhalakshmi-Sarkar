package Chapter8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ReversingList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random r = new Random();
        
        for (int j = 0; j < 5 + r.nextInt(10); j++) {
            al.add(r.nextInt(10, 100));
        }
        System.out.println("List before reversing: " + al );
        Collections.reverse(al);
        System.out.println("List after revering: " + al);
    }
}
