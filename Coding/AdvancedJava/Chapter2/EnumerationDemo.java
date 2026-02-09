import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo{
    public static void main(String[] args) {
        Vector v = new Vector<>();
        for(int i = 0; i <= 10; i++){
            v.addElement(i);
        }

        System.out.println(v);

        for(Enumeration e = v.elements(); e.hasMoreElements();){
            Integer x = (Integer)e.nextElement();
            if(x % 2 == 0){
                System.out.println(x);
            }
        }
    }
}