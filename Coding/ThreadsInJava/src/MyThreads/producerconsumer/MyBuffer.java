package MyThreads.producerconsumer;

public class MyBuffer {
    private int data;
    private boolean hasData = false;

    //producer method
    public synchronized void produce(int value){
        while(hasData){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); //notify consumer
    }

    //consumer method
    public synchronized int consume(){
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // wait if buffer is empty
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); //Notify producer
        return data;
    }
}
