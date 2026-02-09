package MyThreads;
public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        FirstThread ft1 = new FirstThread("ft1");
        FirstThread ft2 = new FirstThread("ft2");

        Thread t2 = new Thread(ft2);
        t2.setPriority(Thread.MAX_PRIORITY);

        Thread t1 = new Thread(ft1);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        Thread.sleep(2000);
        for(int i = 0; i < 10; i++ ){
            System.out.println("\nMain thread");
        }
    }
}
