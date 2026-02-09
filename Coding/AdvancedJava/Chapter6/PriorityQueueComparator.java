package Chapter6;

import java.util.PriorityQueue;

public class PriorityQueueComparator {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue<>(new MyComparator());
        q.add("Aditya");
        q.add("Anchit");
        q.add("Aadya");
        q.add("Aadit");
        q.add("Anant");
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        while(q.size() > 0){
            System.out.println(q.poll());
        }
    }
}
