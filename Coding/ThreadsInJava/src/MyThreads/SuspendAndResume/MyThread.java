package MyThreads.SuspendAndResume;

public class MyThread extends Thread {
    volatile boolean suspended = false;

    public void suspendThread() {
        suspended = true;
    }

    public void resumeThread() {
        suspended = false;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                while (suspended) {
                    Thread.sleep(100);
                }
                System.out.println("Thread running: " + i);

                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
