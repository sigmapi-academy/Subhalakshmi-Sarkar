package Declarations;
public class TestPair {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args){
        Pair<String, Integer> p1 = new Pair<>("one", 1);
        Pair<String, Integer> p2 = new Pair<>("two", 2);
        
        Pair<String, Integer> p3 = new Pair("three", 3);
        System.out.print("\f p1 = (" + p1.getFirst()+", " + p1.getSecond()+")");
        System.out.print("\n p2 = (" + p2.getFirst()+", " + p2.getSecond()+")");
        System.out.print("\n p2 = (" + p3.getFirst()+", " + p3.getSecond()+")");
    }
}
