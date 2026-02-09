package Polymorphism.RuntimePolymorphism;
import java.util.*;


/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle implements Shapes
{
    private double radius;
    @Override
    public double Area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the radius of the circle: ");
        radius = sc.nextDouble();
        return Math.PI * radius * radius;
    }
}