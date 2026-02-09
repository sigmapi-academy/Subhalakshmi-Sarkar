package Polymorphism;

/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    /**
     * @param engineNum we need to provide engine number
     */
    Car(int engineNum){
        super(engineNum);
    }

    public void move(){
        //super.run();    //reusing the parent class code by calling its method.
        System.out.print("\nCar is running smoothly.");
    }

    @Override
    public Car getVehicle(){
        return new Car(12345); //returning the object of Vehicle.
    }
}