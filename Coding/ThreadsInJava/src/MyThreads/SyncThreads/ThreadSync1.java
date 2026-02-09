package MyThreads.SyncThreads;

public class ThreadSync1 extends Thread {
    private MyNumber num;

    public ThreadSync1(MyNumber num){
        this.num = num;
    }
    @Override
    public void run(){
        try {
            num.displayNumber();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
