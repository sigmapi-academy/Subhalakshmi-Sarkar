package GenericsAndCollections;
import java.util.*;
import java.util.function.*;

/**
 * Write a description of class AnotherMax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnotherMax
{
    public static <T extends Comparable<T>> T max(Collection<T> coll, 
    Comparator<? super T> comp){
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();
        while(i.hasNext()){
            T next = i.next();
            if(comp.compare(next, candidate) > 0){
                candidate = next;
            }
        }
        return candidate;
    }
    
    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder(){
        return new Comparator<>(){
            public int compare(T o1, T o2){
                return o1.compareTo(o2);
            }
        };
    }
    
    public static <T extends Comparable<T>> T max(Collection<T> coll){
        return Collections.max(coll, Comparator.naturalOrder());
    }
    
    public static <T, U extends Comparable<? super U>> Comparator<T> 
    comparing(Function<? super T, ? extends U> keyExtractor){
        return (c1, c2)->keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
    }
}