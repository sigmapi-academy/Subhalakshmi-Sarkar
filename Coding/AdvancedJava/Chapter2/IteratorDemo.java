import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            al.add(i);
        }

        System.out.println("\nList: "+ al);
        Iterator iter = al.iterator();
        while (iter.hasNext()) {
            Integer x = (Integer)iter.next();
            if(x % 2 == 0){
                System.out.println(x);
            }
            else{
                iter.remove();
            }
        }
        System.out.println("\nUpdated list: "+al);
    }
}
