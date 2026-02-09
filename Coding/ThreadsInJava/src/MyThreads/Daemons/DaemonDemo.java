package MyThreads.Daemons;

public class DaemonDemo {
    public static void main(String[] args) {
        MyDaemon d = new MyDaemon();
        d.setDaemon(true); //mark as daemon thread
        d.start();
        System.out.println("Main thread ends");
    }
}
