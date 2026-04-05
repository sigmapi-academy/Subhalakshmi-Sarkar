package MyThreads.MultithreadingEnhancement;

public class DisplayThread extends Thread{
    private Display d;
    private String name;
    public DisplayThread(Display d, String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            d.wish(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
