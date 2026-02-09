package MyThreads;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        
        ThreadSync ts1 = new ThreadSync(d1, "Rohit");
        ThreadSync ts2 = new ThreadSync(d2, "Virat");
        ts1.start();
        ts2.start();
    }
}
