package Polymorphism;
import java.util.*;


/**
 * Write a description of class TestShape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestShape
{
    public static void main(String args[]){
        Shapes s = new Shapes();
        Scanner sc = new Scanner(System.in);
        System.out.print("\fPress 1 to calculate area of circle"+
        "\nPress 2 to calculate area of rectangle"+
        "\nPress 3 to calulate area of square"+
        "\nEnter your choice: ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:{
                System.out.print("Enter the radius of the circle:");        
                double r = sc.nextDouble();
                System.out.print("\nArea of circle: "+s.area(r)+" sq. units");
                break;
            }            
            case 2:{
                System.out.print("Enter the length of the rectangle:");        
                double Len = sc.nextDouble();
                System.out.print("Enter the breadth of the rectangle:");        
                double Breadth = sc.nextDouble();                
                System.out.print("\nArea of reactangle: "+s.area(Len, Breadth)+" sq. units");
                break;
            }
            
            case 3:{
                System.out.print("Enter the length of the square:");        
                int Len = sc.nextInt();
                System.out.print("\nArea of square: "+s.area(Len, Len)+" sq. units");
                break;
            }            
            default:
                System.out.print("\nWrong option selected.");
        }
        
    }
}