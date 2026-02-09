package MyThreads.producerconsumer;

public class Main {
    public static void main(String[] args) {
        MyBuffer buffer = new MyBuffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
