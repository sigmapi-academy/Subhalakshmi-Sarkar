package MyThreads.Deadlocks;

public class ThreadN {
    public static void main(String[] args) {
        ThreadM t1 = new ThreadM();
        t1.start();
        try {
            synchronized(t1){
                Thread.sleep(1000);
                System.out.println("Main thread trying to call wait() method");
                t1.wait();
                System.out.println("Main thread got notification");
                System.out.println("Total: "+t1.total);
            }
        }
        catch (InterruptedException e) {
        }
        
    }
}
