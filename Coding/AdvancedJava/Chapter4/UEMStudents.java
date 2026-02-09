import java.util.TreeSet;

public class UEMStudents {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(107, "Harsh");
        Student s3 = new Student(103, "Shiv");
        Student s4 = new Student(106, "Shubh");
        Student s5 = new Student(102, "Rishi");

        TreeSet t = new TreeSet<>();
        t.add(s1);
        t.add(s2);
        t.add(s3);
        t.add(s4);
        t.add(s5);

        System.out.println(t);

        TreeSet t1 = new TreeSet<>(new MyComparatorStudent());
        t1.add(s1);
        t1.add(s2);
        t1.add(s3);
        t1.add(s4);
        t1.add(s5);

        System.out.println(t1);
    }
}
