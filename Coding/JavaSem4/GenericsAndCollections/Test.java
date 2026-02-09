package GenericsAndCollections;
import java.util.*;
import java.math.*;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String args[]){

        //Object obj = "one";
        /*
        Object obj = 1;
        List<Object> objs = List.of(1, 3);
        List<Integer> ints = List.of(1, 2, 3, 4);

        System.out.print("\f"+ objs.contains(obj)); //true
        System.out.print("\n" + objs.containsAll(ints)); //false
        System.out.print("\n" + ints.contains(obj)); //true
        System.out.print("\n" + ints.containsAll(objs)); //true
         */
        /*List<Number> nums = new ArrayList<Number>();
        List<? super Number> sink = nums;
        List<? extends Number> source = nums;
        for(int k = 0; k < 5; k++){
        sink.add(k);
        }
        int sum = nums.stream().mapToInt(Number::intValue).sum();
        assert sum == 10;
        System.out.print("\fSum = " + sum);

        List<List<?>> lists = new ArrayList<List<?>>(); 
        lists.add(List.of(1,2,3));
        lists.add(List.of("four", "five"));
        System.out.print("\nLists: " +lists);
         */
        List<Double> nums = new ArrayList<>();
        nums.add(2.0);
        nums.add(3.5);
        nums.add(0.5);
        nums.add(0.25);
        nums.add(-1.35);
        System.out.println(nums);

        Number m = max(nums);
        System.out.print("\nMaximum value: " + m);
        
        Scanner sc = new Scanner(System.in);
        List<Student> stu = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            System.out.print("\nEnter roll number, name and email: ");
            int rn = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String email = sc.nextLine();
            Student st = new Student(rn, name, email);
            stu.add(st);
        }
        
        //String maxEmail = max(stu);
        Student s = max(stu);
        System.out.print("\nMaximum roll-number: " + s.getRollNum());
    }

    public static <T extends Object & Comparable<? super T>>
    T max(Collection<? extends T> coll){
        Iterator<? extends T> i = coll.iterator();
        T maxValue = i.next();
        while(i.hasNext()){
            T next = i.next();
            if(next.compareTo(maxValue) > 0){
                maxValue = next;
            }
        }
        return maxValue;
    }
    
    
}