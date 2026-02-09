package GenericsAndCollections;
import java.util.*;

/**
 * Write a description of record Event here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * @param x The sample x parameter of the record
 * @param y The sample y parameter of the record
 */
public record Event(String name, int millisecs) implements Comparable<Event>
{
    @Override
    public int compareTo(Event other){
        return Comparator.comparingInt(Event::millisecs).compare(this, other);
    }
}