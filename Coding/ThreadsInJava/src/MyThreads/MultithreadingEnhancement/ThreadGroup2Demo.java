package MyThreads.MultithreadingEnhancement;

public class ThreadGroup2Demo {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("First group");
        Thread t1  = new Thread(g1, "First thread");
        Thread t2 = new Thread(g1, "Second Thread");
        Thread t3 = new Thread(g1, "Third Thread");

        g1.setMaxPriority(3);
        Thread t4 = new Thread(g1, "Fourth Thread"); //new thread added
        System.out.println("Priority of thread t1: "+t1.getPriority()); //5
        System.out.println("Priority of thread t2: "+t2.getPriority()); //5
        System.out.println("Priority of thread t3: "+t3.getPriority()); //5
        System.out.println("Priority of thread t4: "+t4.getPriority()); //3
    
        System.out.println("Priority of group g1: " + g1.getMaxPriority()); //3

        g1.list();

        // demo of enumerate() method
        Thread []ta1 = new Thread[10];
        for (int i = 0; i < ta1.length; i++) {
            ta1[i] = new Thread();
        }

        System.out.println("After adding new thread elements");
        g1.list();

        g1.enumerate(ta1);

        for(Thread t : ta1){
            System.out.println(t);
        }
    }
}
