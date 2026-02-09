package InterfacesInJava;
import java.util.*;

/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle implements Drawable
{
    public void drawRectangle(){
        System.out.print("\nDrawing Rectangle.\n");
    }

    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        r1.drawRectangle();
        r1.message(); //calling default method of an interface.
        Scanner sc = new Scanner(System.in);
        double length, breadth;
        System.out.print("\nEnter length and breadth of the rectangle: ");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        double Area = Drawable.area(length,breadth);
        double peri = Drawable.perimeter(length,breadth);
        System.out.print("\nArea : " + Area+" square units."+
            "\nPerimeter: "+peri+ " units");
    }
}