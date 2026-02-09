package Chapter8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class CollectionsIntegerComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Random r = new Random();
        
        for (int j = 0; j < 5 + r.nextInt(10); j++) {
            al.add(r.nextInt(10, 100));
        }
        System.out.println("\nList before sorting: " + al);
        Collections.sort(al, new MyComparatorInteger());
        System.out.println("Array List in Descending Order: " + al+"\n");

        int index = Collections.binarySearch(al, 45, new MyComparatorInteger());
        if(index > -1){
            System.out.println("Element found at position: "+index);
        }
        else{
            System.out.println("Element insertion point is: " + index);
        }

        
        index = Collections.binarySearch(al, 35, new MyComparatorInteger());
        if(index > -1){
            System.out.println("Element found at position: "+index);
        }
        else{
            System.out.println("Element insertion point is: " + index);
        }

        
        index = Collections.binarySearch(al, 25, new MyComparatorInteger());
        if(index > -1){
            System.out.println("Element found at position: "+index);
        }
        else{
            System.out.println("Element insertion point is: " + index);
        }

        Comparator c = Collections.reverseOrder(new MyComparatorInteger());

        Collections.sort(al, c);

        System.out.println("\nAscending Order: "+al);
        index = Collections.binarySearch(al, 25, c);
        if(index > -1){
            System.out.println("Element found at position: "+index);
        }
        else{
            System.out.println("Element insertion point is: " + index);
        }
    }
}
