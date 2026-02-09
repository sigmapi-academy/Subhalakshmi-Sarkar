import java.util.Comparator;

public class MyComparatorStudent implements Comparator {
    @Override
    public int compare(Object ob1, Object ob2){
        Student st1 = (Student)ob1;
        Student st2 = (Student)ob2;
        return st1.getName().compareTo(st2.getName());
    }
}
