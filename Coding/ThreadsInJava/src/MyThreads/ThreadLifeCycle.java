package MyThreads;

public class ThreadLifeCycle {
    public static void main(String[] args) {
        MyNewThread t = new MyNewThread();
        System.out.println("Thread state after creation: " +t.getState());
        t.start();
        System.out.println("Thread state after t.start(): " +t.getState());

        try {
            Thread.sleep(1000);
            System.out.println("Thread state while running: " + t.getState());

            t.join(); //Main thread waits
            System.out.println("Thread state after join(): " + t.getState()); //TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
