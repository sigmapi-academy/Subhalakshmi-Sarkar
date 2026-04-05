package MyThreads.MultithreadingEnhancement;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        
        DisplayThread t1 = new DisplayThread(d, "Dhoni");
        DisplayThread t2 = new DisplayThread(d, "Surya");

        t1.start();
        t2.start();
        
    }
}
