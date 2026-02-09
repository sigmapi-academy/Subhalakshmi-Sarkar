import java.util.ArrayList;
import java.util.Random;

public class ArrayListThree {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList al = new ArrayList<>(20);
        int i;
        for(i = 0; i < 20; i++){
            al.add(r.nextInt(10, 99));
        }
        System.out.println("ArrayList: "+al);
        Integer x = (Integer)al.remove(5);
        System.out.println("Removed Element: " + x);
        System.out.println("After removal ArrayList: "+al);
        al.add("Shiv");
        System.out.println("ArrayList: "+al);
        System.out.println("\nRemoving object: "+al.remove("Shiv"));
        System.out.println("ArrayList: "+al);
        System.out.println("\nRemoving object: "+al.remove("Shiv"));
    }
}
