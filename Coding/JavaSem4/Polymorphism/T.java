package Polymorphism;


/**
 * Write a description of class T here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class T
{
    public void test(){
        A hold = new B(); //Upcasting
    }
    
    public void testI(){
        I ref = new G(); //upcasting using interface reference variable
    }
}