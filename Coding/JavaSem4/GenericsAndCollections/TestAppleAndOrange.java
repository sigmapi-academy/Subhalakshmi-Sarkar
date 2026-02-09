package GenericsAndCollections;
import java.util.*;

/**
 * Write a description of class TestAppleAndOrange here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestAppleAndOrange
{
    public static void main(String args[]){
        Apple a1 = new Apple(1);
        Apple a2 = new Apple(2);
        Apple a3 = new Apple(3);
        Apple a4 = new Apple(4);
        
        Orange o1 = new Orange(5);
        Orange o2 = new Orange(6);
        Orange o3 = new Orange(7);
        Orange o4 = new Orange(8);
        
        List<Apple> apples = Arrays.asList(a1, a2, a3, a4);
        System.out.print("\f"+Collections.max(apples).equals(a4)); //true
        
        List<Orange> oranges = Arrays.asList(o1, o2, o3, o4);
        System.out.print("\n"+Collections.max(oranges).equals(o4)); //true
        
        List<Fruit> mixed = List.of(a1, o2, a3, o4);
        System.out.print("\nMax: "+Collections.max(mixed)); //Ok
    }
}



