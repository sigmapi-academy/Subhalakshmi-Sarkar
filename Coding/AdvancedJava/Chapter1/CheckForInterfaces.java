import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class CheckForInterfaces{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();    
        LinkedList ll = new LinkedList();
        System.out.println("In case of ArrayList:");
        System.out.println(al instanceof Serializable); //true
        System.out.println(al instanceof Cloneable); //true
        System.out.println(al instanceof RandomAccess); //true
        System.out.println("In case of LinkedList: ");
        System.out.println(ll instanceof Serializable); //true
        System.out.println(ll instanceof Cloneable); //true
        System.out.println(ll instanceof RandomAccess); //false
    }
}