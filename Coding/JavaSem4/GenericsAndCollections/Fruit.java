package GenericsAndCollections;
import java.util.*;

/**
 * Write a description of class Fruit here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Fruit implements Comparable<Fruit>
{
    protected String name;
    protected int size;
    
    protected Fruit(String name, int size){
        this.name = name; this.size = size;
    }
    
    public boolean equals(Object o){
        if (o instanceof Fruit){
            Fruit that = (Fruit)o;
            return this.name.equals(that.name) && 
            this.size == that.size;
        }
        else{
            return false;
        }
    }
    
    public int hashCode(){
        return Objects.hash(name, size);
    }
    
    public int compareTo(Fruit that){
        return Integer.compare(this.size, that.size);
    }
    @Override
    public String toString(){
        return "name: " + this.name+ "\nsize: " + this.size;
    }
}