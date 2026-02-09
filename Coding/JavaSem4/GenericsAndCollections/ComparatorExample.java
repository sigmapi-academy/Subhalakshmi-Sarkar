package GenericsAndCollections;
import java.util.*;

/**
 * Write a description of class ComparatorExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ComparatorExample
{
    //Comparator for comparing lists based on their elements
    public static <E> Comparator<List<E>> listComparator(final Comparator<? super E> comp){
        return new Comparator<>(){
            public int compare(List<E> list1, List<E> list2){
                int n1 = list1.size();
                int n2 = list2.size();
                for(int i = 0 ; i < Math.min(n1, n2); i++){
                    int k = comp.compare(list1.get(i), list2.get(i));
                    if(k != 0) {
                        return k;
                    }
                }
                return Integer.compare(n1, n2);
            }
        };
    }

    public static void main(String args[]){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ravi", 25));
        people.add(new Person("Amit", 30));
        people.add(new Person("Ravi", 22));
        people.add(new Person("Neha", 27));
        //people.add(null);

        Comparator<Person> compareByAge = Comparator.comparingInt(Person::age);

        Comparator<Person> compareByName = 
            Comparator.comparing(Person::name, Comparator.nullsFirst(String::compareTo));

        System.out.print("\f Before sorting: " + people);

        people.sort(Comparator.nullsFirst(compareByAge));
        System.out.print("\n After sorting by Age (null first): " + people);
        
        people.sort(compareByAge.reversed());
        System.out.print("\nSorted by age (reversed): \n" + people);
    }
}