package MyThreads.MultithreadingEnhancement;

public class MyThread extends Thread {
    public MyThread(ThreadGroup g,String name){
        super(g, name);
    }

    @Override
    public void run() {
        System.out.println("Child Thread");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
