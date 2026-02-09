package InterfacesInJava;
import java.util.*;


/**
 * Write a description of class MyArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArray
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        P p = new P();
        p.myPrint("\fEnter the size of the array: ");
        int i, size = sc.nextInt();
        int A[] = new int[size];
        for(i = 0; i < size; i++){
            p.myPrint("Enter the value in A["+i+"]: ");
            A[i] = sc.nextInt();
        }
        p.myPrint("\nThe array A[]: ");
        p.myPrint(Arrays.toString(A));
    }
}