package MyThreads.producerconsumer;

public class Consumer extends Thread {
    private MyBuffer buffer;

    public Consumer(MyBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 100; i <= 500; i+=100) {
            buffer.consume();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        
    }
}
