package MyThreads.SyncThreads;

public class ThreadSync2 extends Thread{
    private MyNumber n;
    public ThreadSync2(MyNumber n){
        this.n = n;
    }

    @Override
    public void run(){
        try {
            n.displayCharacter();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
