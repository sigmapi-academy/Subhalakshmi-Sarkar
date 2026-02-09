package Polymorphism;


/**
 * Write a description of class TestCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCar
{
    public static void main(String args[]){
        System.out.print("\f");
        Car myCar = new Car(123);
        if(myCar instanceof Car){
            myCar.move();
        }
        else{
            System.out.print("\nmyCar is not the object of Car.");
        }
        
        if(myCar instanceof Vehicle){
            myCar.run();
        }
        else{
            System.out.print("\nmyCar is not the Vehicle.");
        }
        
        Car swift = null;
        if(swift instanceof Car){
            swift.move();
        }
        else{
            System.out.print("\nswift is not the object of Car.");
        }
        
        //Downcasting
        //this will compile but at runtime it will throw
        //ClassCastException at runtime
        //Car c = (Car)new Vehicle(123);
        Vehicle v = new Car(123);
        method(v);
    }
    
    public static void method(Vehicle v){
        if (v instanceof Car){
            Car c = (Car)v; //downcasting
            System.out.print("\nDowncasting is performed.");
        }
        else{
            System.out.print("\nUnable to do downcasting.");
        }
    }
}