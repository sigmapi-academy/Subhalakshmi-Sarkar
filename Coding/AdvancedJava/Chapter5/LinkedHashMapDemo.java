package Chapter5;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        System.out.println();
        LinkedHashMap m = new LinkedHashMap();

        m.put("Ajay", 1000);
        m.put("Harsh", 700);
        m.put("Subha", 600);
        m.put("Gargi", 800);
        m.put("Raj", 250);
        m.put("Uday", 1200);

        System.out.println(m);
        
        Set s = m.keySet();
        System.out.println("Set of Keys: "+ s);

        Collection c = m.values();
        System.out.println("Collection of values: " + c);

        Set s1 = m.entrySet();
        System.out.println("Enter set: " + s1 );

        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey() + "===>" + m1.getValue());
            String key = (String)m1.getKey();
            if(key.equals("Raj")){
                m1.setValue(10000);
            }
        }
        System.out.println(m);
    }
}
