package Practice;
import java.util.*;


/**
 * Write a description of class SecondLargestElement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondLargestSmallest{
    private int secondMax;
    private int secondMin;
    public SecondLargestSmallest secondLargeAndSmall(int a[]){
        int t, max = a[0];
        secondMax = a[1];
        int i, min = a[0];
        secondMin = a[1];
        if(max < secondMax){
            t = max;
            max = secondMax;
            secondMax = t;
        }
        if(min > secondMin){
            t = min;
            min = secondMin;
            secondMin = t;
        }
        for(i = 2; i < a.length; i++){
            if(max < a[i]){
                secondMax = max;
                max = a[i];
            }
            else if(secondMax < a[i]){
                secondMax = a[i];
            }
            if(min > a[i]){
                secondMin = min;
                min = a[i];
            }
            else if (secondMin > a[i]){
                secondMin = a[i];
            }
        }
        return this;
    }
    
    public void feedRandom(int A[]){
        int i;
        Random r = new Random();
        for(i = 0; i < A.length; i++){
            A[i] = r.nextInt(-100, 101);
        }
    }
}