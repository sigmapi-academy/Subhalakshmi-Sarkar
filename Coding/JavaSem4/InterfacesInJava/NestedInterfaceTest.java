package InterfacesInJava;


/**
 * Write a description of class NestedInterfaceTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedInterfaceTest implements Showable.Message
{
    @Override
    public void msg(){
        System.out.print("\nI am the method of nested interface");
    }
    public static void main(String args[]){
        Showable.Message m = new NestedInterfaceTest();
        m.msg();
    }
}