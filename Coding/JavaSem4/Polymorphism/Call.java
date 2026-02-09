package Polymorphism;


/**
 * Write a description of class Call here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Call
{
    public void invoke(P p){ //upcasting
        if(p instanceof Apple){
            Apple a = (Apple)p;//downcasting
            a.methodOfApple();
        }
        
        if(p instanceof Banana){
            Banana a = (Banana)p;//downcasting
            a.bananaMethod();
        }
    }
}