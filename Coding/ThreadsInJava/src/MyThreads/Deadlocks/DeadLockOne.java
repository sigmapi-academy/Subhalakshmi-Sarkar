package MyThreads.Deadlocks;

public class DeadLockOne implements Runnable{
    final Object resource1;
    final Object resource2;
    
    public DeadLockOne(Object lock1, Object lock2) {
        this.resource1 = lock1;
        this.resource2 = lock2;
    }

    @Override
    public void run() {
        synchronized(resource1){
            System.out.println(Thread.currentThread().getName() + " acquired lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized(resource2){
                System.out.println(Thread.currentThread().getName() + 
                " acquired lock2");
            }
        }

        synchronized(resource2){
            System.out.println(Thread.currentThread().getName() + " acquired lock1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized(resource1){
                System.out.println(Thread.currentThread().getName() + 
                " acquired lock2");
            }
        }
    }    
}
