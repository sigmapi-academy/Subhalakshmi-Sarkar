package Chapter8;

import java.util.Arrays;
import java.util.Random;

public class CSOUsingArrays {

    public static void main(String[] args) {
        Random r = new Random();
        MyComparator c = new MyComparator();
        int A[] = new int[r.nextInt(10, 20)];
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(10, 100);
        }
        System.out.println("Array before sorting: " + Arrays.toString(A));
        Arrays.sort(A); // for primitive type Comparator is not acceptable
        System.out.println("Array after sorting: " + Arrays.toString(A));
        // Customized sorting order
        System.out.println("Customized sorting order starts here.");

        Character S[] = new Character[r.nextInt(10, 20)];
        String bigAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < S.length; i++) {
            S[i] = bigAlpha.charAt(r.nextInt(26));
        }
        System.out.println("Character array before sorting: " + Arrays.toString(S));
        Arrays.sort(S, c);
        System.out.println("Character array after sorting in CSO: " + Arrays.toString(S));
    }
}
