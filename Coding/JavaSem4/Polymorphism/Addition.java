package Polymorphism;


/**
 * Write a description of class Addition here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
final public class Addition
{
    void sum(int a, long b){
        System.out.print("\n A-function invoked.");
    }
    
    void sum(long a, int b){
        System.out.print("\n B-function invoked.");
    }
    
    public static void main(String args[]){
        Addition ob = new Addition();
        //ob.sum(20,20); //case of ambiguity
        ob.sum(20,20L); // to remove ambiguity we need to specify proper data-types.
        ob.sum(30L,30);
    }
}