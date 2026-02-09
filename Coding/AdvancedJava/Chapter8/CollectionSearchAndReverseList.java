package Chapter8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;


public class CollectionSearchAndReverseList{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        String bigAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        for (int i = 0; i < 10 + r.nextInt(11); i++) {
            al.add(bigAlpha.charAt(r.nextInt(26)));
        }
        System.out.println("List before sorting: " + al);
        MyComparator comp = new MyComparator();
        Collections.sort(al, comp);
        System.out.println("List after sorting: " + al);
        int idx = Collections.binarySearch(al, 'D', comp);

        if (idx > -1){
            System.out.println("Element found at position: " + idx);
        }
        else{
            System.out.println("Element insertion point is: " + idx);
        }
        idx = Collections.binarySearch(al, 'M', comp);
        if (idx > -1){
            System.out.println("Element found at position: " + idx);
        }
        else{
            System.out.println("Element insertion point is: " + idx);
        }
        idx = Collections.binarySearch(al, 'S', comp);
        if (idx > -1){
            System.out.println("Element found at position: " + idx);
        }
        else{
            System.out.println("Element insertion point is: " + idx);
        }
        System.out.println("Reversing the list items:");
        Comparator c = Collections.reverseOrder(comp);
        Collections.sort(al, c);
        System.out.println("Ascending order: " + al);
 
    }
}
