package RuntimePolymorhism;
import java.util.*;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        ArrayList<Polygon> poly = new ArrayList<>();
        poly.add( new Triangle());
        poly.add(new Rectangle());
        poly.add(new Pentagon());
        
        for(Polygon p : poly){
            p.draw();
        }
    }
}