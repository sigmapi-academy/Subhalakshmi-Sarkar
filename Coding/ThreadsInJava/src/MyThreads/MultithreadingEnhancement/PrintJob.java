package MyThreads.MultithreadingEnhancement;

public class PrintJob implements Runnable{
    private String name;

    public PrintJob(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " ...Job started by Thread: "+
            Thread.currentThread().getName());
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " ...Job completed by Thread: "+
            Thread.currentThread().getName());
    }
}
