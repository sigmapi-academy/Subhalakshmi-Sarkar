package Polymorphism;

/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    private int engineNum;
    public Vehicle(int en){
        this.engineNum = en;
    }

    final public void run(){
        System.out.print("\nVehicle is running.");
    }
    
    public Vehicle getVehicle(){
        return new Vehicle(engineNum); //returning the object of Vehicle.
    }
}