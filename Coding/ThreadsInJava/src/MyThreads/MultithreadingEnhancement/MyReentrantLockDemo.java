package MyThreads.MultithreadingEnhancement;

public class MyReentrantLockDemo {
    public static void main(String[] args) {
        MyReentrantLockThread t1 = new MyReentrantLockThread("First thread");
        MyReentrantLockThread t2 = new MyReentrantLockThread("Second thread");

        t1.start();
        t2.start();
        
    }
}
