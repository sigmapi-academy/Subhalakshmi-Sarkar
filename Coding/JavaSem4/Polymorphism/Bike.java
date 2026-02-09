package Polymorphism;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    private int speed;
    private final int speedlimit;
    
    {   //initializer block
        speed = 100;
    }
    
    Bike(int engineNum){//constructor
        super(engineNum);
        speedlimit = 160; //initialized the final variable.
        System.out.print("\nThe speed of bike: " + speed);
    }
    
    public boolean checkSpeed(){
        return (speed <= speedlimit);
    }
}