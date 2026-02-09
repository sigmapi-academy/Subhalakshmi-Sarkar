package Chapter8;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {
    public static void main(String[] args) {
        String str[] = {"Apple", "Zebra", "Boy"};
        List<String> l = Arrays.asList(str);
        System.out.println("List: " + l); //["Apple", "Zebra", "Boy"]
        str[0] = "King";
        System.out.println("List: " + l); //["King", "Zebra", "Boy"]
        l.set(1, "Lion"); //["King", "Lion", "Boy"]
        System.out.println("String Array: ");
        for(String t: str){
            System.out.println(t); 
            //King
            //Lion
            //Boy
        }
    }
}
