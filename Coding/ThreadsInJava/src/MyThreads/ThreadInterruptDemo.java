package MyThreads;

public class ThreadInterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread is executing");
            if (t.isAlive()){
                System.out.println("The child thread is alive");
            }
            else{
                System.out.println("The child thread is not alive");
            }

            if(t.isInterrupted()){
                System.out.println("child thread is interrupted");
            }
            Thread.sleep(1000);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("I am a lazy thread");
            // try {
            //     //Thread.sleep(2000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}
