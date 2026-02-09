package MyThreads.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class ConsumerUsingBQ implements Runnable{
    
    private BlockingQueue<Integer> queue;
    
    public ConsumerUsingBQ(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                int value = queue.take();  //waits if empty
                System.out.println("Consumed: " + value);
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
