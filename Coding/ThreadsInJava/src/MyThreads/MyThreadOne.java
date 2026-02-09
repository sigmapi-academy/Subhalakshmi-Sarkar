package MyThreads;

public class MyThreadOne extends Thread {
    private int whichChild;
    private static Thread mt; // class variable

    public MyThreadOne(int x) {
        whichChild = x;
    }

    public void setThread(Thread t){
        mt = t;
    }
    @Override
    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Child Thread: " + whichChild);

        }
    }
}
