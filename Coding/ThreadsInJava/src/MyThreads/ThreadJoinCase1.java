package MyThreads;
public class ThreadJoinCase1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println();
        MyThreadOne t1 = new MyThreadOne(10);
        t1.setThread(Thread.currentThread());
        // MyThreadOne t2 = new MyThreadOne(20);
        t1.start();
        // t2.start();
        //t1.join();
        for (int index = 0; index < 10; index++) {
            System.out.println("Main Thread");
            Thread.sleep(1500);
        }
    }
}
