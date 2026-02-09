package GenericsAndCollections.GenericClass;


/**
 * Write a description of class TestPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestPair
{
    public static void main(String[] args){
        Pair<String, Integer> p1 = new Pair<>("one", 1);
        Pair<String, Integer> p2 = new Pair<>("two", 2);
        
        Pair<String, Integer> p3 = new Pair("three", 3);
        System.out.print("\f p1 = (" + p1.getFirst()+", " + p1.getSecond()+")");
        System.out.print("\n p2 = (" + p2.getFirst()+", " + p2.getSecond()+")");
    }
}