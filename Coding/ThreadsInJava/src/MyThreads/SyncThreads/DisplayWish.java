package MyThreads.SyncThreads;

public class DisplayWish {
    public void wish(String name){
        ;;;;;;;;;;;;; //million line of code
        ;;;;;;;;;;;;;
        // synchronized(this){//using the current object
        // synchronized( DisplayWish.class){//class level lock
        synchronized(new DisplayWish()){ //object level lock
            for (int i = 0; i < 10; i++) {
                System.out.println("Good morning: " + name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
        ;;;;;;;;;;;;; //million line of code
        ;;;;;;;;;;;;;
    }
}
