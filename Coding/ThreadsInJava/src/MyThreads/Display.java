package MyThreads;

public class Display {
    //synchronized
    public synchronized void wish(String name){

        for (int i = 0; i < 10; i++) {
            System.out.print("\nGood morning: ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(name+ " ");
        }
    }
}
