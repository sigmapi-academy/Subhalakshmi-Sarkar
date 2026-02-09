package MyThreads;

public class MyNewThread extends Thread{

    public void run(){
        System.out.println("Thread is running...");

        
        try {
            System.out.println("Thread goes to Timed Waiting(sleep)...");
            Thread.sleep(2000);
            System.out.println("Thread is running again...");
        } catch (InterruptedException e) {
            System.err.println("Exception: " + e);
        } //Timed waiting

        System.out.println("Thread is terminated");
    }
}
