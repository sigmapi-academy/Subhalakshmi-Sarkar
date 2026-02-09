package MyThreads.producerconsumer;


import java.util.concurrent.BlockingQueue;

public class ProducerUsingBQ implements Runnable{
    private BlockingQueue<Integer> queue;

    public ProducerUsingBQ(BlockingQueue<Integer> queue) {
        this.queue = queue;
    } 

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                queue.put(i+10);
                System.out.println("Produced: " + (i+10));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
