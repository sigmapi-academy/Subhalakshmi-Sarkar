package MyThreads.SyncThreads;

public class SynchronizeDemo {
    public static void main(String[] args) {
        MyNumber num = new MyNumber();
        // MyNumber num2 = new MyNumber();
        ThreadSync1 ts1 = new ThreadSync1(num);
        ThreadSync2 ts2 = new ThreadSync2(num);

        ts1.start();
        ts2.start();

    }
}
