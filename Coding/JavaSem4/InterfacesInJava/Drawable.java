package InterfacesInJava;


/**
 * Write a description of interface Drawable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Drawable
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    default void message(){
        System.out.print("\nDefault method.");
    }
    
    static double area(double length, double breadth){
        return length * breadth;
    }
    
    static double perimeter(double length, double breadth){
        return 2*(length + breadth);
    }
}
