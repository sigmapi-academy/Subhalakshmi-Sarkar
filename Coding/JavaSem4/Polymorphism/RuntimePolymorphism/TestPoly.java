package Polymorphism.RuntimePolymorphism;


/**
 * Write a description of class TestPoly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestPoly
{
    public static void main(String args[]){
        System.out.print("\f");
        //array of reference variables
        Shapes shape[] = new Shapes[4];
        shape[0] = new Circle(); //Upcasting
        shape[1] = new Rectangle();
        shape[2] = new Square();
        shape[3] = new Trapezium();
        int i;
        for(i = 0; i < shape.length; i++){
            //decided on the runctime which Area() method will be called 
            //from which class.
            double ar = shape[i].Area(); 
            String str = shape[i].getClass().getName();
            int lastDot = str.lastIndexOf(".");
            str = str.substring(lastDot + 1);
            System.out.print("\nArea of "+str+": "+ar+" sq. units");
        }
    }
}