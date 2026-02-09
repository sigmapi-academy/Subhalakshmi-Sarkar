package MyThreads.SyncThreads;

public class SynchronizedDemo{
    public static void main(String[] args) {
        DisplayWish dw = new DisplayWish();
        Thread100 t1 = new Thread100(dw, "Narendra Modi");
        Thread100 t2 = new Thread100(dw, "Yogi Aditya Nath");
        Thread100 t3 = new Thread100(dw, "Rahul Gandhi");

        t1.start();
        t2.start();
        t3.start();
    }
}
