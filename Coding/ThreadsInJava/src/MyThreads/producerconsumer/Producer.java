package MyThreads.producerconsumer;

public class Producer extends Thread {
    private MyBuffer buffer;

    public Producer(MyBuffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run(){
        for (int i = 100; i <= 500; i+=100) {
            buffer.produce(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
