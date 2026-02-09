package MyThreads.Deadlocks;
public class ThreadM extends Thread{
    int total = 0;
    @Override
    public void run(){
        try{
            synchronized(this){
            System.out.println("Child thread starts the calculation.");
            for (int i = 1; i <= 100; i++) {
                total += i;
            }
        }
        System.out.println("Child thread trying to give notification");
        this.notify();    
        }
        catch(IllegalMonitorStateException e){
            System.err.println("I am not the owner of the object.");
        }
    }
}
