package MyThreads.Daemons;

public class MyDaemon extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running....");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
