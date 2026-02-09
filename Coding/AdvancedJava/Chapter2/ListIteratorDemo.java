import java.util.*;
public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Balakrishna");
        ll.add("Rama");
        ll.add("Ravichandran");
        ll.add("Lakshminarayan");
        ll.add("Bharat");
        System.out.println(ll);
        ListIterator li = ll.listIterator();
        while(li.hasNext()){
            String s = (String)li.next();
            if(s.equals("Rama")){
                li.remove();
            }
            else if(s.equals("Bharat")){
                li.add("Shiv");
            }
            else if(s.equals("Lakshminarayan")){
                li.set("LN");
            }

            System.out.println(ll+"\n");
        }
    }
}
