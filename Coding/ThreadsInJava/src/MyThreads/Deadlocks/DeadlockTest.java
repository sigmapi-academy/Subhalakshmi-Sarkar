package MyThreads.Deadlocks;

public class DeadlockTest {
    public static void main(String[] args){
        Object r1 = new Object();
        Object r2 = new Object();

        Thread t1 = new Thread(new DeadLockOne(r1, r2), "Thread-1");
        
        Thread t2 = new Thread(new DeadLockOne(r1, r2), "Thread-2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        
        DeadLockDetector.detectDeadLock();
    }
}
