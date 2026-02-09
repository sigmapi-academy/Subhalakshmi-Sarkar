package GenericsAndCollections;
import java.util.*;

/**
 * Write a description of class TestComparator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestComparator
{
    public static void main(String args[]){
        Comparator<String>  sizeOrder = 
            new Comparator<>(){
                public int compare(String s1, String s2){
                    return
                    s1.length() < s2.length() ? -1 : s1.length() > s2.length() ? 1 : s1.compareTo(s2);
                }
            };
            
        System.out.print("\f"+ "two".compareTo("three"));
        System.out.print("\n" + sizeOrder.compare("two", "three"));
        
        Collection<String> strings = Arrays.asList("from", "aaa", "to", "zzz");
        System.out.print("\n"+ Collections.max(strings)); //zzz
        System.out.print("\n" + Collections.min(strings));//aaa
        System.out.print("\n" + Collections.max(strings, sizeOrder));//from
        System.out.print("\n" + Collections.min(strings, sizeOrder));//to
    }
}
