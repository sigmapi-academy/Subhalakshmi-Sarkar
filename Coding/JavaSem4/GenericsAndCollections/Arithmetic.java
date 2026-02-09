package GenericsAndCollections;
import java.util.*;

/**
 * Write a description of class Arithmetic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arithmetic
{
    public static double sum(Collection<? extends Number> nums){
        double s = 0.0;
        for(Number num : nums){
            s += num.doubleValue();
        }
        return s;
    }

    public static double Sum(Collection<?extends Number> nums){
        return nums.stream().mapToDouble(Number::doubleValue).sum();
    }

    public static void count(Collection<? super Integer> ints, int n){
        for(int i = 0; i < n; i++){
            ints.add(i);
        }
    }

    public static double sumCount(Collection<Number> nums, int n){
        count(nums, n);
        return sum(nums);
    }
    
    public static void main(String args[]){
        System.out.print("\f");
        List<Integer> ints = List.of(1,2,3);
        assert sum(ints) == 6.0;

        List<Double> doubles = List.of(2.5, 3.5);
        assert sum(doubles) == 6.0;

        List<Number> nums = List.of(1, 2, 2.5, 3.5);
        assert Sum(nums) == 9.0;
        
        List<Integer> ints1 = new ArrayList<>();
        count(ints1, 5);
        System.out.print("\nints1 = "+ints1);
        
        List<Number> nums1 = new ArrayList<>();
        count(nums1, 5);
        nums1.add(5.0);
        System.out.print("\nnums1 = " + nums1);
        
        List<Object> objs1 = new ArrayList<>();
        count(objs1, 5);
        objs1.add("Five");
        System.out.print("\nobjs1 = " + objs1);
        
        List<Number> nums2 = new ArrayList<>();
        double sum = sumCount(nums2, 5);
        System.out.print("\nSum = " + sum);
        
        
        List<Integer> ints2 = new ArrayList<>();
        ints2.add(1);
        ints2.add(2);
        List<? extends Number> nums3 = ints2;
        double dbl = sum(nums); 
        //nums3.add(3.14);//
        nums3.add(null);
        System.out.print("\nnums3 = " + nums3);
        
        List<Object> objs2 = List.of(1, "two");
        List<? super Integer> ints4 = objs2;
        String str = "";
        for(Object ob : ints4){
            str += ob.toString();
        }
        System.out.print("\nstr = " + str);
    }
}