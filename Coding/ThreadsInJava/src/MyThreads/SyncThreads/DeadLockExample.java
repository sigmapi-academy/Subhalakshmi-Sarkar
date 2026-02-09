package MyThreads.SyncThreads;

public class DeadLockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadLockExample demo = new DeadLockExample();
        Thread t1 = new Thread(demo::method1, "Thread-1");
        Thread t2 = new Thread(demo::method2, "Thread-2");
        t1.start();
        t2.start();
    }
    void method1(){
        synchronized(lock1){
            System.out.println("Thread-1: holding lock-1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread-1: Waiting for lock-2");
            synchronized(lock2){
                /* works */
                System.out.println("Thread-1: holding lock-1 and lock-2");
            }
        }
    }

    void method2(){
        synchronized(lock2){ //opposite order causes deadlock
            System.out.println("Thread-2: holding lock2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread-2: waiting for lock1");
            synchronized(lock1){
                /* works */
                System.out.println("Thread-2: holding lock1 and lock2");
            }
        }
    }
}
