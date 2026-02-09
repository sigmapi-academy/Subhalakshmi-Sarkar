package GenericsAndCollections.GenericClass;


/**
 * Write a description of class Pair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pair<T, U> 
{
    private final T first;
    private final U second;
    
    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    
    public T getFirst(){
        return first;
    }
    
    public U getSecond(){
        return second;
    }
}