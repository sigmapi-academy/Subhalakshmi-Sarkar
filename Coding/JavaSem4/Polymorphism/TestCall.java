package Polymorphism;


/**
 * Write a description of class TestCall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestCall
{
    public static void main(String args[]){
        System.out.print("\f");
        P p = new Banana();
        Call c = new Call();
        c.invoke(p);
        
        p = new Apple();
        c.invoke(p);
    }
}