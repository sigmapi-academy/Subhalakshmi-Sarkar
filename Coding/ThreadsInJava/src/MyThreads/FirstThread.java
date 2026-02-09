package MyThreads;

public class FirstThread implements Runnable {
    private String threadName;

    
    public FirstThread(String threadName) {
        this.threadName = threadName;
    }


    @Override
    public void run(){
        final int max = 10;
        for (int i = 0; i < max; i++) {
            System.out.println(i+": Child thread = "+ threadName);
            // try {
            //     // Thread.sleep(1500);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}
