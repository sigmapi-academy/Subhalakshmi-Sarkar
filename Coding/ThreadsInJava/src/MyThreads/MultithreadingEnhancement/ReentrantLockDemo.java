package MyThreads.MultithreadingEnhancement;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock l = new ReentrantLock();

        l.lock();
        l.lock();
        System.out.println(l.isLocked()); //true
        System.out.println(l.isHeldByCurrentThread()); //true
        System.out.println(l.getQueueLength()); //0
        l.unlock();
        l.unlock();
        System.out.println(l.isLocked()); //false
        System.out.println(l.isFair()); //false
    }
}
