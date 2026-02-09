package Polymorphism;

/**
 * Write a description of class Shapes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shapes
{
    /**
     * returns the area of circle in double.
     * @param radius of a circle
     */
    public double area(double radius){
        return Math.PI * radius * radius;
    }

    /**
     * returns the area of rectangle in double
     * @param length length of the rectangle
     * @param breadth breadth of the rectangle
     */
    public double area(double length, double breadth){
        return length * breadth;
    }
    /**
     * Overloaded area method which returns area in int form.
     * @param length length of the rectangle
     * @param breadth breadth of the rectangle
     */
    public int area(int len, int breadth){
        return len * breadth;
    }
}