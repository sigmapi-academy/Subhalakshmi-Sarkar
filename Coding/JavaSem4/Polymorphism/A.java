package Polymorphism;


/**
 * Write a description of class A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A
{
    private int x;
    //final A(){
    A(){
    }
    static final double PI;
    static{
        PI = 22.0/7;
    }
    //public void printSumOfDigits(final int num){
    public void printSumOfDigits(int num){
        int s = 0;
        for(;num > 0; s = s + (num % 10), num/= 10);
        System.out.print("\nSum of digits: " + s);
    }
    public static void main(String args[]){
        System.out.print("\fPI = "+ PI);
    }
}