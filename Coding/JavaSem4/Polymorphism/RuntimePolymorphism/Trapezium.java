package Polymorphism.RuntimePolymorphism;
import java.util.*;


/**
 * Write a description of class Trapezium here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trapezium implements Shapes
{
    private double side1, side2, height;
    @Override
    public double Area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the side1 of the trapezium: ");
        side1= sc.nextDouble();
        System.out.print("\nEnter the side2 of the trapezium: ");
        side2 = sc.nextDouble();
        System.out.print("\nEnter the height of the trapezium: ");
        height = sc.nextDouble();
        return 0.5 * (side1 + side2)*height;
    }
}