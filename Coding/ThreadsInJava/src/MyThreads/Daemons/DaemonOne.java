package MyThreads.Daemons;

public class DaemonOne {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        Thread.currentThread().setDaemon(true); //IllegalThreadStateException
    }
}
