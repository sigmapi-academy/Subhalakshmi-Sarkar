package InterfacesInJava;

/**
 * Write a description of class TestNestedInterface2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestNestedInterface2 implements AnyClass.Message
{
    public void msg(){
        System.out.print("\nI am the abstract method of nested interface "+
            "present in AnyClass");
    }
    public static void main(String args[]){
        AnyClass.Message am = new TestNestedInterface2();
        am.msg();
    }
}