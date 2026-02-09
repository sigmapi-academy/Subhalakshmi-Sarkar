package Polymorphism.RuntimePolymorphism;
import java.util.*;

/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle implements Shapes
{
    private double length, breadth;
    @Override
    public double Area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("\nEnter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
        return length * breadth;
    }
}