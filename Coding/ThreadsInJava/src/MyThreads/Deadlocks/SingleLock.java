package MyThreads.Deadlocks;

public class SingleLock {
    static final Object LOCK = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized(LOCK){
                System.out.println("Thread 1 is working");
            }
        });
        
        Thread t2 = new Thread(() -> {
            synchronized(LOCK){
                System.out.println("Thread 2 is working");
            }
        });

        t1.start();
        t2.start();
    }
}
