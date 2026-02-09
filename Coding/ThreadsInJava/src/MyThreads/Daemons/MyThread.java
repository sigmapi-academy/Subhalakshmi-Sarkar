package MyThreads.Daemons;

public class MyThread extends Thread{
    private int x;

    public MyThread(int x) {
        this.x = x;
    }
    
    MyThread(){
        this(0);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("\nChild thread"+x+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
