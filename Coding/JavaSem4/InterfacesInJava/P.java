package InterfacesInJava;


/**
 * Write a description of class P here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class P implements Printable
{
    @Override
    public void myPrint(String str){
        System.out.print(str);
    }
}