package Chapter6;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        Random r = new Random();
        // System.out.println(q.peek());
        // System.out.println(q.element());
        for (int i = 0; i < 10; i++) {
            q.offer(r.nextInt(10, 100));
        }
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        for(; q.size() > 0; ){
            System.out.println(q.poll());
        }
    }
}
