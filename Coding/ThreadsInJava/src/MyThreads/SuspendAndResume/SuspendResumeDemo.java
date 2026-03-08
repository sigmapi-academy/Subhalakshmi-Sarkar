package MyThreads.SuspendAndResume;

public class SuspendResumeDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        try {
            Thread.sleep(2000);
            System.out.println("Thread Suspended");
            t1.suspendThread();
            Thread.sleep(3000);
            
            for(int i = 0; i < 10; i++ ){
                System.out.println("Main Thread: "+ i);
            }

            System.out.println("Thread resume");
            t1.resumeThread();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
