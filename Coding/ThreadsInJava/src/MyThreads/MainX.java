package MyThreads;

public class MainX {
    public static void main(String[] args) {
        ThreadX t1 = new ThreadX();
        ThreadX t2 = new ThreadX();

        t1.start();
        t2.start();
    }
}
