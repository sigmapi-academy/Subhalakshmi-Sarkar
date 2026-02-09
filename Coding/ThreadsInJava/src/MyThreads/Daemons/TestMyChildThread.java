package MyThreads.Daemons;

public class TestMyChildThread {
    public static void main(String[] args) {
        MyThread t = new MyThread(5);
        MyThread ut = new MyThread(100);
        if(t.isDaemon()){
            System.out.println("\nMyChild Thread is daemon");
        }
        else{
            System.out.println("\nMyChild Thread is not daemon");
        }
        t.setDaemon(true);
        t.start();
        ut.start();
        if(t.isDaemon()){
            System.out.println("\nMyChild Thread t is daemon");
        }
        else{
            System.out.println("\nMyChild Thread t is not daemon");
        }
        if(ut.isDaemon()){
            System.out.println("\nMyChild Thread ut is daemon");
        }
        else{
            System.out.println("\nMyChild Thread ut is not daemon");
        }
        
        System.out.println("Priority of child thread t: "+t.getPriority());
        System.out.println("Priority of child thread ut: "+ut.getPriority());
        System.out.println("Main thread");
    }
}
