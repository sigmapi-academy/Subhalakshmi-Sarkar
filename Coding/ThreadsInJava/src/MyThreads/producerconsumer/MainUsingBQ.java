package MyThreads.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainUsingBQ {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);

        new Thread(new ProducerUsingBQ(queue)).start();
        new Thread(new ConsumerUsingBQ(queue)).start();

    }
}
